# Annotation Processing
### Jintin

---
### What is Annotation

- Syntactic metadata
- Used for Class, Method, Parameter, Variable...
- Different scope for different purpose

---
### Custom Annotation Example

```Java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Tweezable {
}
```

---
### @Retention
#### Life cycle of Annotation

- SOURCE: not include in compiled class file
- CLASS: store in .class but not available in runtime
- RUNTIME: available in runtime

---
### @Target
#### Define the type which can be annotated.

- TYPE: Class, interface or enum
- FIELD: variable
- METHOD: function
- PARAMETER: function parameter
- CONSTRUCTOR: constructor
- LOCAL_VARIABLE: local variable
- ANNOTATION_TYPE: annotation
- PACKAGE: package

---
### What Annotation Processing do

- Annotate in source code
- Compile
- Generate Code
