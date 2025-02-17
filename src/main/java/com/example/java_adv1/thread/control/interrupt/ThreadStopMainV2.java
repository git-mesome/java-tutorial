package com.example.java_adv1.thread.control.interrupt;


import static com.example.java_adv1.util.MyLogger.log;
import static com.example.java_adv1.util.ThreadUtils.sleep;

public class ThreadStopMainV2 {


  public static void main(String[] args) {
    final MyTask task = new MyTask();
    final Thread thread = new Thread(task, "work");
    thread.start();

    sleep(4000);
    log("작업 중단 지시 thread.interrupt");
    thread.interrupt();
    log("work 스레드 인터럽트 상태1 = "+thread.isInterrupted());
  }

  static class MyTask implements Runnable {

    @Override
    public void run() {
      try {
        while (true) {
          log("작업 중");
          Thread.sleep(3000);
        }
      } catch (InterruptedException e) {
        log("work 스레드 인터럽트 상태2 = " + Thread.currentThread().isInterrupted());
        log("interrupt message = " + e.getMessage());
        log("state = " + Thread.currentThread().getState());
      }
      log("자원 정리");
      log("자원 종료");
    }
  }
}
