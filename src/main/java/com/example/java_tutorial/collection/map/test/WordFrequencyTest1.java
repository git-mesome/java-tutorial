package com.example.java_tutorial.collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
  public static void main(String[] args) {
    String text = "orange banana apple apple banana apple";

    final String[] splitStr = text.split(" ");

    final Map<String, Integer> map = new HashMap<>();
    //    for (String word : splitStr) {
    //      Integer count = map.get(word);
    //      if (count == null) {
    //        count = 0;
    //      }
    //      count++;
    //      map.put(word, count);
    //    }

    for (String word : splitStr) {
      map.put(word, map.getOrDefault(word, 0) + 1);
    }

    System.out.println(map);
  }
}
