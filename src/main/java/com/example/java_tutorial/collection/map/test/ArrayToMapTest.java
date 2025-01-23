package com.example.java_tutorial.collection.map.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ArrayToMapTest {
  public static void main(String[] args) {
    String[][] productArr =
        {
            {"Java", "10000"}
            , {"Python", "20000"}
            , {"C++", "30000"}
        };

    final Map<String, Integer> productMap = new HashMap<>();
    for (final String[] product : productArr) {
      productMap.put(product[0], Integer.valueOf(product[1]));
    }

    for (Map.Entry<String, Integer> entry : productMap.entrySet()) {
      System.out.println("제품: " + entry.getKey() + ", 가격: " + entry.getValue());
    }

  }
}
