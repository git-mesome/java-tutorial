package com.example.java_tutorial.generic.ex3;

import com.example.java_tutorial.generic.animal.Cat;
import com.example.java_tutorial.generic.animal.Dog;

public class AnimalHospitalMainV1 {
  public static void main(String[] args) {
    AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
    AnimalHospitalV1 catHospital = new AnimalHospitalV1();

    Dog dog = new Dog("멍멍이1", 100);
    Cat cat = new Cat("나옹이1", 100);

    dogHospital.set(dog);
    dogHospital.checkup();

    catHospital.set(cat);
    catHospital.checkup();

    // 문제1 : 개 병원에 고양이 전달
    dogHospital.set(cat); // 매개변수 체크 실패 -> 컴파일 오류 발생하지 않음

    // 문제2 : 개 타입 반환
    dogHospital.set(dog);
    Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));
    System.out.println("biggerDog = " + biggerDog);
  }
}
