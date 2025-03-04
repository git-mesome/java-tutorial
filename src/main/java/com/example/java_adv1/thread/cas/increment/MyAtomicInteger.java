package com.example.java_adv1.thread.cas.increment;

import java.util.concurrent.atomic.AtomicInteger;

public class MyAtomicInteger implements IncrementInteger {

  // 초기값 부여 가능
  AtomicInteger atomicInteger = new AtomicInteger(0);

  @Override
  public void increment() {
    atomicInteger.incrementAndGet();
  }

  @Override
  public int get() {
    return atomicInteger.get();
  }

}
