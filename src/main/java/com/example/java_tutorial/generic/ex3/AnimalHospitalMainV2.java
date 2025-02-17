package com.example.java_tutorial.generic.ex3;

import com.example.java_tutorial.generic.animal.Cat;
import com.example.java_tutorial.generic.animal.Dog;

public class AnimalHospitalMainV2 {
  public static void main(String[] args) {
    AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
    AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
    AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();

    Dog dog = new Dog("멍멍이1", 100);
    Cat cat = new Cat("나옹이1", 100);

    dogHospital.set(dog);
    dogHospital.checkup();

    catHospital.set(cat);
    catHospital.checkup();

    // 문제1 해결 : 개 병원에 고양이 전달 불가
    //    dogHospital.set(cat);

    // 문제2 : 개 타입 반환
    dogHospital.set(dog);
    Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));
    System.out.println("biggerDog = " + biggerDog);
  }
}
