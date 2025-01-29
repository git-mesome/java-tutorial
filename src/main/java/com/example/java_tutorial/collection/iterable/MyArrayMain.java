package com.example.java_tutorial.collection.iterable;

import java.util.Iterator;

public class MyArrayMain {

  public static void main(String[] args) {
    final MyArray myArray = new MyArray(new int[]{1, 2, 3, 4,});
    final Iterator<Integer> iterator = myArray.iterator();

    System.out.println("iterator 사용");
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    // iterable을 가지고 있어야 향상된 for 문 사용 가능
    System.out.println("for-each 사용");
    for (int value : myArray) {
      System.out.println(value);
    }

  }
}
