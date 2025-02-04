package com.example.java_adv1.thread.start;


import static com.example.java_adv1.util.MyLogger.log;

public class InnerRunnableMainV4 {

  public static void main(String[] args) {
    log("main() start");

    final Thread thread = new Thread(() -> log("run()"));
    thread.start();

    log("main() end");
  }


}
