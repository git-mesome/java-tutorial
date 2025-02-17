package com.example.java_tutorial.nested;

public class ShdowingMain {
  public int value = 1;

  public static void main(String[] args) {
    ShdowingMain main = new ShdowingMain();
    Inner inner = main.new Inner();
    inner.go();
  }

  class Inner {
    public int value = 2;

    void go() {
      int value = 3;
      System.out.println("value = " + value);
      System.out.println("this.value = " + this.value);
      System.out.println("ShadowingMAin.value = " + ShdowingMain.this.value);
    }
  }
}
