package com.example.java_tutorial.rambda;

public class LambdaMainV4 {

  public static void main(String[] args) {
    PersonV3 person = new PersonV3();

    person.action(((x, y) -> {
      double result = x + y;
      return result;
    }));

    person.action((x, y) -> (x + y));

    person.action((x, y) -> sum(x, y));

  }

  static double sum(double x, double y) {
    return x + y;
  }

}
