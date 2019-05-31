package com.jintin.autofactory;

@AutoElement(tag = AnimalTags.CAT)
public class Cat implements Animal {
    @Override
    public void bark() {
        System.out.println("meow");
    }
}
