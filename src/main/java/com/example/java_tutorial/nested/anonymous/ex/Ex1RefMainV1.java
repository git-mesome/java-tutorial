package com.example.java_tutorial.nested.anonymous.ex;

import java.util.Random;

// 정적 클래스 사용
public class Ex1RefMainV1 {

  public static void hello(Process process) {
    System.out.println("프로그램 시작");
    process.run();
    System.out.println("프로그램 종료");
  }

  public static void main(String[] args) {
    Dice dice = new Dice();
    Sum sum = new Sum();
    hello(dice);
    hello(sum);
  }

  static class Dice implements Process {
    @Override
    public void run() {
      int randomValue = new Random().nextInt(6) + 1;
      System.out.println("주사위 = " + randomValue);
    }
  }

  static class Sum implements Process {

    @Override
    public void run() {
      for (int i = 0; i < 3; i++) {
        System.out.println("i = " + i);
      }
    }
  }
}
