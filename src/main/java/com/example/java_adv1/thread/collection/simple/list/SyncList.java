package com.example.java_adv1.thread.collection.simple.list;

import static com.example.java_adv1.util.ThreadUtils.sleep;
import java.util.Arrays;

public class SyncList implements SimpleList {

  private static final int DEFAULT_CAPACITY = 5;
  private Object[] elementData;
  private int size = 0;

  public SyncList() {
    elementData = new Object[DEFAULT_CAPACITY];
  }

  @Override
  public synchronized int size() {
    return size;
  }

  @Override
  public synchronized void add(Object e) {
    elementData[size] = e;
    sleep(100);
    size++;
  }

  @Override
  public synchronized Object get(int index) {
    return elementData[index];
  }

  @Override
  public synchronized String toString() {
    return Arrays.toString(Arrays.copyOf(elementData, size)) +
        " size=" + size +
        " elementData=" + elementData.length;
  }
}
