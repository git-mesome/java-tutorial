package java_adv3.methodref.start;

import java.util.function.BinaryOperator;

public class MethodRefStartV1 {

  public static void main(String[] args) {
    BinaryOperator<Integer> add1 = (x, y) -> add(x, y);
    BinaryOperator<Integer> add2 = (x, y) -> add(x, y);

    Integer result1 = add1.apply(1, 2);
    System.out.println("add1 = " + add1);

    Integer result2 = add2.apply(1, 2);
    System.out.println("add2 = " + add2);

  }

  static int add(int x, int y) {
    return x + y;
  }

}
