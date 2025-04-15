package java_adv3.lambda.lambda3;

import java.util.function.Function;

public class TargetType3 {

  public static void main(String[] args) {
    Function<Integer, Integer> functionA = n -> n * n;
    System.out.println(functionA.apply(10));

    Function<Integer, Integer> functionB = functionA;
    System.out.println(functionB.apply(20));
  }

}
