package java_adv3.lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterMainV2 {

  public static void main(String[] args) {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    List<Integer> eventNumbers = filter(numbers, number -> number % 2 == 0);
    System.out.println("eventNumbers = " + eventNumbers);

    List<Integer> oddNumbers = filter(numbers, number -> number % 2 == 1);
    System.out.println("oddNumbers = " + oddNumbers);
  }

  private static List<Integer> filter(List<Integer> numbers, Predicate<Integer> predicate) {
    List<Integer> filtered = new ArrayList<>();
    for (Integer number : numbers) {
      if (predicate.test(number)) {
        filtered.add(number);
      }
    }
    return filtered;
  }


}
