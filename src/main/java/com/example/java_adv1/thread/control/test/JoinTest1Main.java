package com.example.java_adv1.thread.control.test;

import com.example.java_adv1.util.ThreadUtils;

import static com.example.java_adv1.util.MyLogger.log;
import static com.example.java_adv1.util.ThreadUtils.*;

public class JoinTest1Main {

  public static void main(String[] args) throws InterruptedException {
    final Thread t1 = new Thread(new MyTask(), "t1");
    final Thread t2 = new Thread(new MyTask(), "t2");
    final Thread t3 = new Thread(new MyTask(), "t3");

    t1.start();
    t1.join();

    t2.start();
    t2.join();

    t3.start();
    t3.join();

    System.out.println("모든 스레드 실행 완료");
  }

  static class MyTask implements Runnable {

    @Override
    public void run() {
      for (int i = 1; i <= 3; i++) {
        log(i);
        sleep(1000);
      }
    }
  }
}
