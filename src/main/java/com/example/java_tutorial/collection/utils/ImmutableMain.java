package com.example.java_tutorial.collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {

  public static void main(String[] args) {
    // 불변 리스트 생성
    final List<Integer> list = List.of(1, 2, 3);

    // 가변 리스트
    final ArrayList<Integer> mutableList = new ArrayList<>(list);
    mutableList.add(4);
    System.out.println("mutableList = " + mutableList);
    System.out.println("mutableList class = " + mutableList.getClass());

    // 다시 불변 리스트로
    final List<Integer> unmodifiableList = Collections.unmodifiableList(mutableList);
    System.out.println("unmodifiableList = " + unmodifiableList.getClass());

    // java.lang.UnsupportedOperationException
    //  unmodifiableList.add(5);
  }
}
