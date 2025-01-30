package com.example.java_tutorial.collection.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncMain {

  public static void main(String[] args) {
    final ArrayList<Integer> list = new ArrayList<>();
    //스레드1
    list.add(1);
    list.add(2);
    list.add(3);

    //스레드2
    list.remove(1);

    System.out.println("list.getClass() = " + list.getClass());
    final List<Integer> synchronizedList = Collections.synchronizedList(list);
    System.out.println("synchronizedList.getClass() = " + synchronizedList.getClass());

  }
}
