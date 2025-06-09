package java_adv3.lambda.lambda5.mystream;

import java.util.List;

public class MyStreamV1Main {

  public static void main(String[] args) {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    returnValue(numbers);
    methodChain(numbers);
  }

  static void returnValue(List<Integer> numbers) {
    MyStreamV1 stream = new MyStreamV1(numbers);
    MyStreamV1 filter = stream.filter(number -> number % 2 == 0);
    MyStreamV1 map = filter.map(number -> number * 2);
    List<Integer> result = map.toList();
    System.out.println("result = " + result);

  }

  static void methodChain(List<Integer> numbers) {
    List<Integer> result = new MyStreamV1(numbers)
        .filter(n -> n % 2 == 0)
        .map(n -> n * 2)
        .toList();

    System.out.println("result = " + result);
  }

}
