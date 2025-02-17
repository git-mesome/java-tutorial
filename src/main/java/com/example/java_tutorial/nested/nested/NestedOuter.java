package com.example.java_tutorial.nested.nested;

public class NestedOuter {

  private static int outClassVaule = 3;
  private int outInstanceValue = 2;

  static class Nested {
    private int nestedInstanceValue = 1;

    public void print() {
      System.out.println(nestedInstanceValue);

      // 접근 불가- 클래스,메서드영역 static
      // System.out.println(outInstanceValue);

      System.out.println(outClassVaule);
      System.out.println(NestedOuter.outClassVaule);
    }
  }
}
