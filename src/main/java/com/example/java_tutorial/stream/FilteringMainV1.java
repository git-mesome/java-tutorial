package com.example.java_tutorial.stream;

import java.util.ArrayList;
import java.util.List;

public class FilteringMainV1 {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("a");
    list.add("b");
    list.add("b");
    list.add("bc");
    list.add("d");

    list.stream()
        .distinct()
        .forEach(System.out::println);

    System.out.println();

    list.stream()
        .filter(n -> n.startsWith("b"))
        .forEach(System.out::println);
    System.out.println();

    list.stream()
        .distinct()
        .filter(n -> n.startsWith("b"))
        .forEach(System.out::println);
  }

}
