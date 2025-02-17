package com.example.java_tutorial.generic.animal;

public class Cat extends Animal {

  public Cat(String name, int size) {
    super(name, size);
  }

  @Override
  public void sound() {
    System.out.println("cat sound");
  }
}
