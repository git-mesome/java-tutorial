package com.example.java_tutorial.collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {
  public static void main(String[] args) {

    final Map<String, Integer> map1 = Map.of("A", 1, "B", 2, "C", 3);

    final Map<String, Integer> map2 = new HashMap<>();
    map2.put("B", 4);
    map2.put("C", 5);
    map2.put("D", 6);

    final Map<String, Integer> map3 = new HashMap<>();

//    for (Map.Entry<String, Integer> entry : map1.entrySet()) {
//      final String key = entry.getKey();
//      final int value = entry.getValue();
//
//      if (map2.containsKey(key)) {
//        map3.put(key, map2.get(key) + value);
//      }
//    }

    for (String key : map1.keySet()) {
      int value = map1.get(key);

      if (map2.containsKey(key)) {
        map3.put(key, map2.get(key) + value);
      }
    }

    System.out.println(map3);
  }
}
