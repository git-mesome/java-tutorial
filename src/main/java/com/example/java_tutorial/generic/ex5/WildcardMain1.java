package com.example.java_tutorial.generic.ex5;

import com.example.java_tutorial.generic.animal.Animal;
import com.example.java_tutorial.generic.animal.Cat;
import com.example.java_tutorial.generic.animal.Dog;

public class WildcardMain1 {
  public static void main(String[] args) {
    Box<Object> objectBox = new Box<>();
    Box<Dog> dogBox = new Box<>();
    Box<Cat> catBox = new Box<>();

    dogBox.set(new Dog("멍멍이", 100));

    WildcardEx.printGenericV1(dogBox);
    WildcardEx.printWildcardV1(dogBox);

    WildcardEx.printGenericV2(dogBox);
    WildcardEx.printWildcardV2(dogBox);

    Dog dog = WildcardEx.printAndReturnGeneric(dogBox);
    Animal animal = WildcardEx.printAndReturnWildcard(dogBox);


  }
}
