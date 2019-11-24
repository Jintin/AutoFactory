package com.jintin.autofactory;

@AutoElement(AnimalTags.CAT)
public class Cat implements Animal {
    @Override
    public String bark() {
        return "meow";
    }
}
