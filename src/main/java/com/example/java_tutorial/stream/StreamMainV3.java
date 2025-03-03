package com.example.java_tutorial.stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamMainV3 {

  public static void main(String[] args) {
    String[] strArrays = {"a", "b", "c", "d", "e"};
    Stream<String> stream = Arrays.stream(strArrays);
    stream.forEach(item -> System.out.print(item + ","));
    System.out.println();

    int[] intArrays = {1, 2, 3, 4, 5};
    Arrays.stream(intArrays).forEach(item -> System.out.print(item + ","));
  }

}
