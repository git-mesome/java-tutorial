package com.example.java_adv1.thread.executor.reject;

import com.example.java_adv1.thread.executor.RunnableTask;
import static com.example.java_adv1.util.MyLogger.log;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class RejectMainV4 {

  public static void main(String[] args) {
    ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS,
        new SynchronousQueue<>(), new MyRejectedExecutionHandler());

    executor.submit(new RunnableTask("task1"));
    executor.submit(new RunnableTask("task2"));
    executor.submit(new RunnableTask("task3"));

    executor.close();
  }

  static class MyRejectedExecutionHandler implements RejectedExecutionHandler {

    static AtomicInteger count = new AtomicInteger(0);

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
      int i = count.incrementAndGet();
      log("[경로] 거절된 누적 작업 수: " + i);
    }

  }

}
