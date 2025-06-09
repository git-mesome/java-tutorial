package java_adv3.lambda.lambda5.mystream;

import java.util.ArrayList;
import java.util.List;
import java_adv3.lambda.lambda5.filter.GenericFilter;
import java_adv3.lambda.lambda5.map.GenericMapper;

public class Ex1_Number {

  public static void main(String[] args) {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    List<Integer> directResult = direct(numbers);
    System.out.println("directResult = " + directResult);

    List<Integer> lambdaResult = lambda(numbers);
    System.out.println("lambdaResult = " + lambdaResult);
  }

  static List<Integer> direct(List<Integer> numbers) {
    List<Integer> result = new ArrayList<>();
    for (Integer number : numbers) {
      if (number % 2 == 0) {
        int numberX2 = number * 2;
        result.add(numberX2);
      }
    }
    return result;
  }

  static List<Integer> lambda(List<Integer> numbers) {
    List<Integer> filter = GenericFilter.filter(numbers, n -> n % 2 == 0);
    List<Integer> map = GenericMapper.map(filter, n -> n * 2);
    return map;
  }


}
