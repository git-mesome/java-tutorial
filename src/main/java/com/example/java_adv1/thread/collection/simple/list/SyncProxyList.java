package com.example.java_adv1.thread.collection.simple.list;

public class SyncProxyList implements SimpleList {

  private final SimpleList target;

  public SyncProxyList(SimpleList target) {
    this.target = target;
  }

  @Override
  public synchronized int size() {
    return target.size();
  }

  @Override
  public synchronized void add(Object element) {
    target.add(element);
  }

  @Override
  public synchronized Object get(int index) {
    return target.get(index);
  }

  @Override
  public String toString() {
    return target.toString() + " by " + this.getClass().getSimpleName();
  }
}
