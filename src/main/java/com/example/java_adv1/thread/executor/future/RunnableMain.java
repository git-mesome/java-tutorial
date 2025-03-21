package com.example.java_adv1.thread.executor.future;

import static com.example.java_adv1.util.MyLogger.log;
import static com.example.java_adv1.util.ThreadUtils.sleep;
import java.util.Random;

public class RunnableMain {

  public static void main(String[] args) throws InterruptedException {
    MyRunnable task = new MyRunnable();
    Thread thread = new Thread(task, "Thread-1");
    thread.start();
    thread.join();
    int result = task.value;
    log("Result is " + result);

  }

  static class MyRunnable implements Runnable {

    int value;

    @Override
    public void run() {
      log("Runnable 시작");
      sleep(2000);
      value = new Random().nextInt(10);
      log("create value = " + value);
      log("Runnable 완료");
    }
  }

}
