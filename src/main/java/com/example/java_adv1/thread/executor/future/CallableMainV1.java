package com.example.java_adv1.thread.executor.future;

import static com.example.java_adv1.util.MyLogger.log;
import static com.example.java_adv1.util.ThreadUtils.sleep;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableMainV1 {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService es = Executors.newFixedThreadPool(2);
    Future<Integer> future = es.submit(new MyCallable());
    Integer result = future.get();
    log("result value: " + result);
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
