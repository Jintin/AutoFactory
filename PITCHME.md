# Annotation Processing
### Jintin

---
### What is Annotation

- Syntactic metadata
- Used for Class, Method, Parameter, Variable...
- Different scope for different purpose

---
### Custom Annotation Example

```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Tweezable {
}
```

---
### @Retention
#### Life cycle of Annotation

- SOURCE
- CLASS
- RUNTIME

---
### @Target
#### Define the type which can be annotated.

- TYPE
- FIELD
- METHOD
- PARAMETER
- CONSTRUCTOR
- LOCAL_VARIABLE
- ANNOTATION_TYPE
- PACKAGE

---
### What Annotation Processing do

- Annotate in source code
- Compile
- Generate Code

---
### Example

Implement Simple Factory pattern

---
### Simple Factory

- Separate of Concerns
- Hide instantiate logic
- Communicate on interface

---
### Interface
```java
public interface Animal {
    void bark();
}
```

---
### Implementation
```java
public class Cat implements Animal {
    @Override
    public void bark() { }
}

public class Dog implements Animal {
    @Override
    public void bark() { }
}
```

---
### Factory
```java
public class AnimalFactory {
    public static Animal createAnimal(String type) {
        switch (type) {
            case "cat":
                return new Cat();
            case "dog":
                return new Dog();
        }
        throw new RuntimeException("not support type");
    }
}
```

---
### Usage
```java
public class Test {
    public static void main(String args) {
        Animal cat = AnimalFactory.createAnimal("cat");
        cat.bark();
    }
}

```

---
### Demo

Rewrite