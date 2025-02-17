package com.example.java_tutorial.collection.set;

import java.util.Arrays;

public class HashStart2 {
  public static void main(String[] args) {
    // 배열의 인덱스 그대로 값이 전달
    // [null, 1, 2, null, null, 5, null, null, 8, null]
    Integer[] inputArray = new Integer[10];
    inputArray[1] = 1;
    inputArray[2] = 2;
    inputArray[5] = 5;
    inputArray[8] = 8;
    System.out.println("inputArray = " + Arrays.toString(inputArray));

    int searchValue = 8;
    Integer result = inputArray[searchValue];
    System.out.println(result);
  }
}
