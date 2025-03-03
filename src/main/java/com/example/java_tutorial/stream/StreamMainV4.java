package com.example.java_tutorial.stream;

import java.util.stream.IntStream;

public class StreamMainV4 {

  public static int sum;

  public static void main(String[] args) {
    IntStream intStream = IntStream.rangeClosed(1, 100);
    intStream.forEach(a -> sum += a);
    System.out.println("끝 수 포함한 합 = " + sum);

    sum = 0;
    IntStream intStream2 = IntStream.range(1, 100);
    intStream2.forEach(a -> sum += a);
    System.out.println("끝 수 포함하지않은 합 = " + sum);
  }

}
