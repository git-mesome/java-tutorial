package com.example.java_adv1.thread.executor.future;

import static com.example.java_adv1.util.MyLogger.log;
import static com.example.java_adv1.util.ThreadUtils.sleep;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMainV2 {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService es = Executors.newFixedThreadPool(2);
    log("submit() 호출");
    Future<Integer> future = es.submit(new MyCallable());
    log("future 즉시 반환, future = " + future);

    log("future.get() [블로킹] 메서드 호출 시작 -> main 스레드 WAITING");
    Integer result = future.get();
    log("future.get() [블로킹] 메서드 호출 완료 -> main 스레드 RUNNABLE");

    log("result value: " + result);
    log("future 완료, future = " + future);
    es.close();
  }

  static class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() {
      log("Callable 시작");
      sleep(2000);
      int value = new Random().nextInt(10);
      log("create value: " + value);
      log("Callable 완료");
      return value;
    }
  }

}
