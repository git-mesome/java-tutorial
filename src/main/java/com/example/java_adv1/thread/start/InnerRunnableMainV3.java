package com.example.java_adv1.thread.start;


import static com.example.java_adv1.util.MyLogger.log;

public class InnerRunnableMainV3 {

  public static void main(String[] args) {
    log("main() start");

    // inline variable
    final Thread thread = new Thread(new Runnable() {
      @Override
      public void run() {
        log("run()");
      }
    });
    thread.start();

    log("main() end");
  }


}
