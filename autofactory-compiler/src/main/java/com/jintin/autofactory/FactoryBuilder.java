package com.jintin.autofactory;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.JavaFile;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.processing.Filer;
import javax.lang.model.element.Modifier;


public class FactoryBuilder {
    private Filer filer;
    private Map<ClassName, List<ElementInfo>> input;

    public FactoryBuilder(Filer filer, Map<ClassName, List<ElementInfo>> input) {
        this.filer = filer;
        this.input = input;
    }

    public void generate() throws IOException {
        for (ClassName key : input.keySet()) {
            MethodSpec.Builder methodBuilder = MethodSpec.methodBuilder("create" + key.simpleName())
                    .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                    .addParameter(String.class, "type")
                    .beginControlFlow("switch(type)");
            for (ElementInfo elementInfo : input.get(key)) {
                methodBuilder
                        .addStatement("case $S: return new $T()", elementInfo.tag, elementInfo.className);
            }

            methodBuilder
                    .endControlFlow()
                    .addStatement("throw new RuntimeException(\"not support type\")")
                    .returns(key);
            MethodSpec methodSpec = methodBuilder.build();
            TypeSpec helloWorld = TypeSpec.classBuilder(key.simpleName() + "Factory")
                    .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
                    .addMethod(methodSpec)
                    .build();
            JavaFile javaFile = JavaFile.builder(key.packageName(), helloWorld)
                    .build();

            javaFile.writeTo(filer);
        }
    }
}
