package com.example.java_adv1.thread.control.join;

import static com.example.java_adv1.util.MyLogger.log;
import static com.example.java_adv1.util.ThreadUtils.sleep;

public class JoinMainV4 {

  public static void main(String[] args) throws InterruptedException {
    log("start");
    final SumTask task1 = new SumTask(1, 50);
    final Thread thread1 = new Thread(task1, "thread-1");
    thread1.start();

    // 스레드가 종료될 때 까지 대기
    log("join() - main 스레드가 thread1 종료까지 1초 대기");
    thread1.join(1000);
    log("main 스레드 대기 완료");

    log("task1.result: " + task1.result);

    int sumAll = task1.result;
    log("작업완료 = " + sumAll);

    log("end");
  }

  static class SumTask implements Runnable {

    int startValue;
    int endValue;
    int result;

    public SumTask(final int startValue, final int endValue) {
      this.startValue = startValue;
      this.endValue = endValue;
    }

    @Override
    public void run() {
      log("작업 시작");
      sleep(2000);
      int sum = 0;
      for (int i = startValue; i <= endValue; i++) {
        sum += i;
      }
      result = sum;
      log("작업 완료 result: " + result);
    }
  }
}
