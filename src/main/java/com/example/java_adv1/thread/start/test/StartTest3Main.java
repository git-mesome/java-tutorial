package com.example.java_adv1.thread.start.test;

import static com.example.java_adv1.util.MyLogger.log;

public class StartTest3Main {

  public static void main(String[] args) {

    log("Main start");

    final Thread thread =
        new Thread(
            new Runnable() {
              @Override
              public void run() {
                for (int i = 1; i < 6; i++) {
                  log(": value " + i);
                  try {
                    Thread.sleep(1000);
                  } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                  }
                }
              }
            },
            "counter");
    thread.start();

    log("Main end");
  }
}
