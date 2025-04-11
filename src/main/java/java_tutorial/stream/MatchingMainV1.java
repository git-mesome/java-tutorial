package java_tutorial.stream;

import java.util.Arrays;

public class MatchingMainV1 {

  public static void main(String[] args) {
    int[] intArray = {2, 4, 6};

    boolean result = Arrays.stream(intArray)
        .allMatch(a -> a % 2 == 0);
    System.out.println("모두 2의 배수인가? " + result);

    result = Arrays.stream(intArray)
        .anyMatch(a -> a % 2 == 0);
    System.out.println("하나라도 2의 배수인가? " + result);

    result = Arrays.stream(intArray)
        .noneMatch(a -> a % 2 == 0);
    System.out.println("2의 배수가 없는가? " + result);

  }

}
