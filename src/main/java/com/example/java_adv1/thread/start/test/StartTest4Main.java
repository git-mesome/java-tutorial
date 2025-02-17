package com.example.java_adv1.thread.start.test;

import static com.example.java_adv1.util.MyLogger.log;

public class StartTest4Main {

  public static void main(String[] args) {

    log("Main start");

    final Thread threadA = new Thread(getThread("A", 1000), "Thread-A");
    final Thread threadB = new Thread(getThread("B", 500), "Thread-B");

    threadA.start();
    threadB.start();

    log("Main end");
  }

  private static Runnable getThread(final String value, final int millis) {
    return new Runnable() {
      @Override
      public void run() {
        while (true) {
          log(value);
          try {
            Thread.sleep(millis);
          } catch (InterruptedException e) {
            throw new RuntimeException(e);
          }
        }
      }
    };
  }
}
