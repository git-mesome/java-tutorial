package com.example.java_tutorial.generic.animal;

public class Dog extends Animal {

  public Dog(String name, int size) {
    super(name, size);
  }

  @Override
  public void sound() {
    System.out.println("Dog sound");
  }
}
