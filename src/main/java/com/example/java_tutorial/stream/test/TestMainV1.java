package com.example.java_tutorial.stream.test;

import java.util.List;

public class TestMainV1 {

  public static void main(String[] args) {
    List<String> list = List.of("This is a java book",
        "Lambda Expressions",
        "Java8 support lambda expressions"
    );

    list.stream()
        .filter(s -> s.toLowerCase().contains("java"))
        .forEach(System.out::println);

    list.stream()
        .filter(s -> s.toLowerCase().contains("java"))
        .forEach(System.out::println);

  }

}
