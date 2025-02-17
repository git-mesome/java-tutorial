package com.example.java_adv1.thread.volatile1;

import static com.example.java_adv1.util.MyLogger.log;
import static com.example.java_adv1.util.ThreadUtils.sleep;

public class VolatileCountMain {

  public static void main(String[] args) {
    final Task task = new Task();
    final Thread thread = new Thread(task, "work");
    thread.start();

    sleep(1000);

    task.flag = false;
    log("flag = " + task.flag + ", count = " + task.count + " in main");
  }

  static class Task implements Runnable {

    boolean flag = true;
    long count;

    //    volatile boolean flag = true;
    //    volatile long count;

    @Override
    public void run() {
      while (flag) {
        count++;
        if (count % 100_000_000 == 0) {
          log("flag = " + flag + ", count = " + count + " in while()");
        }
      }
      log("flag = " + flag + ", count = " + count + " 종료");
    }
  }
}
