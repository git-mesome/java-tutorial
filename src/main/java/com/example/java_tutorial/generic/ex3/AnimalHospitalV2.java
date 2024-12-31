package com.example.java_tutorial.generic.ex3;

// 컴파일 오류 > 제네릭 도입과 실패
public class AnimalHospitalV2<T> {
  private T animal;

  public void set(T animal) {
    this.animal = animal;
  }

  public void checkup() {
//    System.out.println("동물 이름: " + animal.getName());
//    System.out.println("동물 크기: " + animal.getSize());
//    animal.sound();
  }

  public T bigger(T target) {
//    return animal.getSize() > target.getSize() ? animal : target;
    return animal;
  }
}
