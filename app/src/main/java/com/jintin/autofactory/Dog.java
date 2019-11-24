package com.jintin.autofactory;

@AutoElement(AnimalTags.DOG)
public class Dog implements Animal {
    @Override
    public String bark() {
        return "woo";
    }
}
