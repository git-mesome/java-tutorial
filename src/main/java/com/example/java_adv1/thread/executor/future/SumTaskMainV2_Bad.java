package com.example.java_adv1.thread.executor.future;

import static com.example.java_adv1.util.MyLogger.log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SumTaskMainV2_Bad {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    SumTask task1 = new SumTask(1, 50);
    SumTask task2 = new SumTask(51, 100);
    ExecutorService es = Executors.newFixedThreadPool(2);

    //스레드가 종료될 때 까지 대기

    Future<Integer> future1 = es.submit(task1);
    Integer sum1 = future1.get(); //2초

    Future<Integer> future2 = es.submit(task2);
    Integer sum2 = future2.get(); //2초 / 총 4초

    log("task1.result=" + sum1);
    log("task2.result=" + sum2);

    int sumAll = sum1 + sum2;
    log("task1 + task2 = " + sumAll);
    log("End");
    es.close();
  }

  static class SumTask implements Callable<Integer> {

    int startValue;
    int endValue;
    int result = 0;

    public SumTask(int startValue, int endValue) {
      this.startValue = startValue;
      this.endValue = endValue;
    }


    @Override
    public Integer call() throws InterruptedException {
      log("작업 시작");

      Thread.sleep(2000);

      int sum = 0;
      for (int i = startValue; i <= endValue; i++) {
        sum += i;
      }

      result = sum;
      log("작업 완료 result=" + result);
      return result;
    }
  }

}
