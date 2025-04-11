package java_tutorial.stream;

import java.util.Arrays;

public class LoopingMainV1 {

  public static void main(String[] args) {
    int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    Arrays.stream(intArray)
        .filter(a -> a % 2 == 0)
        .peek(System.out::println);

    int total = Arrays.stream(intArray)
        .filter(a -> a % 2 == 0)
        .peek(System.out::print)
        .sum();

    System.out.println();
    System.out.println("total = " + total);

    Arrays.stream(intArray)
        .filter(a -> a % 2 == 0)
        .forEach(System.out::print);

    int sum = Arrays.stream(intArray)
        .filter(a -> a % 2 == 0)
        .sum();

    System.out.println();
    System.out.println("sum = " + sum);


  }

}
