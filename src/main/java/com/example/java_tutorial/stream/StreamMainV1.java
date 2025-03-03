package com.example.java_tutorial.stream;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamMainV1 {

  public static void main(String[] args) {
    Set<String> set = new HashSet<>();
    set.add("1");
    set.add("2");
    set.add("3");

    set.stream().forEach(System.out::println);

    Stream<String> stream = set.stream();
    stream.forEach(name -> System.out.println(name));


  }

}
