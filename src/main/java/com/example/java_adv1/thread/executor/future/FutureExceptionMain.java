package com.example.java_adv1.thread.executor.future;

import static com.example.java_adv1.util.MyLogger.log;
import static com.example.java_adv1.util.ThreadUtils.sleep;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExceptionMain {

  public static void main(String[] args) {
    ExecutorService es = Executors.newFixedThreadPool(1);
    log("작업 전달");
    Future<Integer> future = es.submit(new ExCallable());
    sleep(1000);

    try {
      log("future.get() 호출 시도, future.state(): " + future.state());
      Integer result = future.get();
      log("result value: " + result);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    } catch (ExecutionException e) {
      log("e = " + e);
      Throwable cause = e.getCause(); // 원본 예외
      log("cause = " + cause);
    }
    es.close();
  }

  static class ExCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
      log("Callable 실행, 예외 발생");
      throw new IllegalStateException("ex!");
    }
  }

}
