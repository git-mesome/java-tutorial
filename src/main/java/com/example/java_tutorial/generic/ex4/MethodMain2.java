package com.example.java_tutorial.generic.ex4;

import com.example.java_tutorial.generic.animal.Cat;
import com.example.java_tutorial.generic.animal.Dog;

public class MethodMain2 {
  public static void main(String[] args) {
    Dog dog = new Dog("멍멍이", 100);
    Cat cat = new Cat("냐옹이", 100);

    AnimalMethod.checkup(dog);
    AnimalMethod.checkup(cat);

    Dog targetDog = new Dog("큰 멍멍이", 200);
    Dog bigger = AnimalMethod.bigger(dog, targetDog);
    System.out.println("bigger = " + bigger);
  }
}
