package java_adv3.lambda.ex2;

import java.util.List;

public class ReduceExample {

  public static Integer reduce(List<Integer> list, int initial, MyReducer reducer) {
    int result = initial;
    for (Integer val : list) {
      result = reducer.reduce(result, val);
    }

    return result;
  }

  public static void main(String[] args) {
    List<Integer> list = List.of(1, 2, 3, 4);
    System.out.println("리스트: " + list);

    System.out.println("합(누적 +): " + reduce(list, 0, (a, b) -> a + b));
    System.out.println("곱(누적 *): " + reduce(list, 1, (a, b) -> a * b));
  }

}
