package com.example.java_tutorial.rambda;

public class LambdaMainV2 {

  public static void main(String[] args) {
    Person person = new Person();

    person.action(() -> System.out.println("퇴근"));

    person.action(() -> {
      System.out.println("출근");
      System.out.println("프로그래밍중");
    });
  }
}
