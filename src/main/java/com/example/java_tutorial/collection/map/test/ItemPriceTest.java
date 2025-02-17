package com.example.java_tutorial.collection.map.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemPriceTest {
  public static void main(String[] args) {
    final Map<String, Integer> map = new HashMap<>();
    map.put("사과", 500);
    map.put("바나나", 500);
    map.put("망고", 1000);
    map.put("딸기", 1000);

    final List<String> result = new ArrayList<>();
    for (String key : map.keySet()) {
      if (map.get(key).equals(1000)) {
        result.add(key);
      }
    }
    System.out.println(result);
  }
}
