package com.example.java_tutorial.generic.ex2;

import com.example.java_tutorial.generic.animal.Animal;
import com.example.java_tutorial.generic.animal.Cat;
import com.example.java_tutorial.generic.animal.Dog;

// 상속 타입도 가능
public class AnimalMain2 {
  public static void main(String[] args) {
    Animal animal = new Animal("동물", 0);
    Dog dog = new Dog("멍멍이", 100);
    Cat cat = new Cat("냐옹이", 50);

    Box<Animal> animalBox = new Box<>();
    animalBox.set(animal);
    animalBox.set(dog);
    animalBox.set(cat);

    Animal findAnimal = animalBox.get();
    System.out.println("findAnimal = " + findAnimal);
  }
}