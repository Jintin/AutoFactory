package com.jintin.autofactory;

import java.lang.String;

public final class AnimalFactory {
  public static Animal createAnimal(String type) {
    switch(type) {
      case "cat": return new Cat();
      case "dog": return new Dog();
    }
    throw new RuntimeException("not support type");
  }
}
