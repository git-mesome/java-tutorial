package java_adv3.lambda.ex1;

import java_adv3.lambda.MyFunction;

public class M5Return {

  static MyFunction getOperation(String operator) {
    return switch (operator) {
      case "add" -> (a, b) -> a + b;
      case "sub" -> (a, b) -> a - b;
      default -> (a, b) -> 0;
    };
  }

  public static void main(String[] args) {
    int add = getOperation("add").apply(1, 2);
    System.out.println("add(1,2) = " + add);
    int sub = getOperation("sub").apply(1, 2);
    System.out.println("sub(1,2) = " + sub);
    int xxx = getOperation("xxx").apply(1, 2);
    System.out.println("xxx(1,2) = " + xxx);
  }

}
