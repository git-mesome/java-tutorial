package com.example.java_adv1.thread.bounded;

public interface BoundedQueue {

  void put(String data) throws InterruptedException;

  String take();

}
