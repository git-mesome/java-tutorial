package java_adv3.optional;

import java.util.Optional;

public class Test {

  public static void main(String[] args) {
    Optional<String> optStr = Optional.ofNullable("Hello");
    if (optStr.isPresent()) {
      System.out.println(optStr.get());
    } else {
      System.out.println("Nothing");
    }

    System.out.println(optStr.orElse("Nothing"));
  }
}
