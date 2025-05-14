package java_adv3.lambda.lambda4;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierMain {

  public static void main(String[] args) {
    Supplier<Integer> supplier1 = new Supplier<>() {
      @Override
      public Integer get() {
        return new Random().nextInt(10);
      }
    };
    System.out.println("supplier1 = " + supplier1.get());

    Supplier<Integer> supplier2 = () -> new Random().nextInt(10);
    System.out.println("supplier2 = " + supplier2.get());
  }

}
