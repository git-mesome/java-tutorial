package com.example.java_adv1.thread.control.join;

import static com.example.java_adv1.util.MyLogger.log;
import static com.example.java_adv1.util.ThreadUtils.sleep;

public class JoinMainV2 {

  public static void main(String[] args) {
    log("start");
    final SumTask task1 = new SumTask(1, 50);
    final SumTask task2 = new SumTask(51, 100);
    final Thread thread1 = new Thread(task1, "thread-1");
    final Thread thread2 = new Thread(task2, "thread-2");

    thread1.start();
    thread2.start();

    // 정확한 타이밍을 맞춰 기다리기 어려움
    log("main 스레드 sleep()");
    sleep(3000);
    log("main 스레드 깨어남");

    log("task1.result: " + task1.result);
    log("task2.result: " + task2.result);

    int sumAll = task1.result + task2.result;
    log("task1 + task2 = " + sumAll);

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
