package com.example.java_adv1.thread.cas;

import static com.example.java_adv1.util.MyLogger.log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CasMainV3 {

  private static int THREAD_COUNT = 2;

  public static void main(String[] args) throws InterruptedException {
    AtomicInteger atomicInteger = new AtomicInteger(0);
    System.out.println("start value = " + atomicInteger.get());

    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        incrementAndGet(atomicInteger);
      }
    };
    List<Thread> threads = new ArrayList<>();
    for (int i = 0; i < THREAD_COUNT; i++) {
      Thread thread = new Thread(runnable);
      threads.add(thread);
      thread.start();
    }

    for (Thread thread : threads) {
      thread.join();
    }

    int i = atomicInteger.get();
    System.out.println(atomicInteger.getClass().getSimpleName() + " result value = " + i);

  }

  private static int incrementAndGet(AtomicInteger atomicInteger) {
    int getValue;
    boolean result;
    do {
      getValue = atomicInteger.get();
      log("getValue: " + getValue);
      result = atomicInteger.compareAndSet(getValue, getValue + 1);
      log("result: " + result);
    } while (!result);

    return getValue + 1;
  }


}
