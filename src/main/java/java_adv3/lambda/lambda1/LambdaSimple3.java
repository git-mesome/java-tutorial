package java_adv3.lambda.lambda1;

import java_adv3.lambda.MyFunction;

public class LambdaSimple3 {

  public static void main(String[] args) {
    MyFunction function1 = (int a, int b) -> a + b;

    MyFunction function2 = (a, b) -> a + b;
    int result = function2.apply(1, 2);
    System.out.println("result = " + result);

  }

}
