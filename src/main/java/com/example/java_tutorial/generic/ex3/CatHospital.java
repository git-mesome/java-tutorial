package com.example.java_tutorial.generic.ex3;

import com.example.java_tutorial.generic.animal.Cat;

public class CatHospital {
  private Cat animal;

  public void set(Cat animal) {
    this.animal = animal;
  }

  public void checkup() {
    System.out.println("동물 이름: " + animal.getName());
    System.out.println("동물 크기: " + animal.getSize());
    animal.sound();
  }

  public Cat bigger(Cat target) {
    return animal.getSize() > target.getSize() ? animal : target;
  }
}
