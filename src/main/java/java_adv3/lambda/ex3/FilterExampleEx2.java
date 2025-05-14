package java_adv3.lambda.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterExampleEx2 {

  public static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate) {
    List<Integer> result = new ArrayList<>();
    for (Integer val : list) {
      if (predicate.test(val)) {
        result.add(val);
      }
    }
    return result;


  }

  public static void main(String[] args) {
    List<Integer> numbers = List.of(-3, -2, -1, 1, 2, 3, 5);
    System.out.println("원본 리스트: " + numbers);

    // 1.음수만 뽑아내기
    System.out.println("음수만: " + filter(numbers, value -> value < 0));

    // 2. 짝수만 뽑아내기
    System.out.println("짝수만: " + filter(numbers, value -> value % 2 == 0));
  }

}
