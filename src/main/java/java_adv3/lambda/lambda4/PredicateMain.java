package java_adv3.lambda.lambda4;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateMain {

  public static void main(String[] args) {
    Predicate<Integer> predicate1 = new Predicate<>() {
      @Override
      public boolean test(Integer integer) {
        return integer % 2 == 0;
      }
    };
    System.out.println("predicate1 = " + predicate1.test(4));

    Predicate<Integer> predicate2 = integer -> integer % 2 == 0;
    System.out.println("predicate2 = " + predicate2.test(3));

    Function<Integer, Boolean> function = integer -> integer % 2 == 0;
    System.out.println("function = " + function.apply(4));
  }

}
