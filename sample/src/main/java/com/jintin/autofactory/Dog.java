package com.jintin.autofactory;

@AutoElement(tag = AnimalTags.DOG)
public class Dog implements Animal {
    @Override
    public void bark() {
        System.out.println("woo");
    }
}
