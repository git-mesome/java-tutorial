package com.example.java_tutorial.collection.set;

import java.util.Arrays;

public class MyHashSetV0 {

  private int[] element = new int[10];
  private int size = 0;

  //O(n)
  public boolean add(int value) {
    if (contains(value)) {
      return false;
    }

    element[size] = value;
    size++;
    return true;
  }

  // O(n)
  public boolean contains(int value) {
    for (int data : element) {
      if (data == value) {
        return true;
      }
    }
    return false;
  }

  public int size() {
    return size;
  }

  @Override
  public String toString() {
    return "MyHashSetV0{" +
        "element=" + Arrays.toString(Arrays.copyOf(element, size)) +
        ", size=" + size +
        '}';
  }

}
