package com.example.java_tutorial.nested.nested;

public class NestOuterMain {
  public static void main(String[] args) {
    NestedOuter outer = new NestedOuter();
    NestedOuter.Nested nested = new NestedOuter.Nested();
    nested.print();

    System.out.println(nested.getClass());
  }
}
