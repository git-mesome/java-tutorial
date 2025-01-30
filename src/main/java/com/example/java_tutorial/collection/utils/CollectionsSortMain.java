package com.example.java_tutorial.collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSortMain {
  public static void main(String[] args) {
    final List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(100);
    list.add(4);
    list.add(5);

    final Integer max = Collections.max(list);
    final Integer min = Collections.min(list);

    System.out.println("max = " + max);
    System.out.println("min = " + min);

    System.out.println("list = " + list);
    Collections.shuffle(list);
    System.out.println("shuffle list = " + list);

    // list.soft 가 더 낫다.
    Collections.sort(list);
    System.out.println("sort list = " + list);

    Collections.reverse(list);
    System.out.println("reverse list = " + list);

  }
}
