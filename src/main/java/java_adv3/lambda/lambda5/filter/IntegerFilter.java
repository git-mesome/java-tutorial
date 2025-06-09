package java_adv3.lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class IntegerFilter {

  public static List<Integer> filter(List<Integer> numbers, Predicate<Integer> predicate) {
    List<Integer> filtered = new ArrayList<>();
    for (Integer number : numbers) {
      if (predicate.test(number)) {
        filtered.add(number);
      }
    }
    return filtered;
  }

}
