package com.example.java_tutorial.nested.anonymous;

import com.example.java_tutorial.nested.local.Printer;

// 지역클래스와 비슷하지만, 생성 및 사용 부분을 합칠 수 있음
public class AnonymousOuter {
  private int outInstanceVar = 3;

  public void process(int paramVar) {
    int localVar = 1;

    // 익명 클래스 > 클래스 이름이 없음
    // new 부모클래스/인터페이스
    Printer printer = new Printer() {
      int value = 0;

      @Override
      public void print() {
        System.out.println("value=" + value);
        System.out.println("localVar=" + localVar);
        System.out.println("paramVar=" + paramVar);
        System.out.println("outInstanceVar=" + outInstanceVar);
      }
    };
    printer.print();
    System.out.println("printer.class=" + printer.getClass());

  }

  public static void main(String[] args) {
    AnonymousOuter main = new AnonymousOuter();
    main.process(2);
  }

}
