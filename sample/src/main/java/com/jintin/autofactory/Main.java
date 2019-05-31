package com.jintin.autofactory;

public class Main {

    public static void main(String[] args) {
        Animal dog = AnimalFactory.createAnimal(AnimalTags.DOG);
        dog.bark();
    }
}
