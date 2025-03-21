package com.example.java_tutorial.generic.ex3;

import com.example.java_tutorial.generic.animal.Cat;
import com.example.java_tutorial.generic.animal.Dog;

public class AnimalHospitalMainV0 {
  public static void main(String[] args) {
    DogHospital dogHospital = new DogHospital();
    CatHospital catHospital = new CatHospital();

    Dog dog = new Dog("멍멍이1", 100);
    Cat cat = new Cat("나옹이1", 100);

    dogHospital.set(dog);
    dogHospital.checkup();

    catHospital.set(cat);
    catHospital.checkup();

    // 문제1 : 개 병원에 고양이 전달
    // dogHospital.set(cat); 다른 타입 입력 -> 컴파일 오류

    // 문제2 : 개 타입 반환
    dogHospital.set(dog);
    Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
    System.out.println("biggerDog = " + biggerDog);
  }
}
