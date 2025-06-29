package java_adv3.lambda.lambda5.filter;

import java.util.List;

public class FilterMainV4 {

  public static void main(String[] args) {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    List<Integer> eventNumbers = IntegerFilter.filter(numbers, number -> number % 2 == 0);
    System.out.println("eventNumbers = " + eventNumbers);

    List<Integer> oddNumbers = IntegerFilter.filter(numbers, number -> number % 2 == 1);
    System.out.println("oddNumbers = " + oddNumbers);
  }

}
