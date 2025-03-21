package com.example.java_adv1.thread.executor.reject;

import com.example.java_adv1.thread.executor.RunnableTask;
import static com.example.java_adv1.util.MyLogger.log;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;
import java.util.concurrent.TimeUnit;

public class RejectMainV1 {

  public static void main(String[] args) {
    ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS,
        new SynchronousQueue<>(), new AbortPolicy());

    executor.submit(new RunnableTask("task1"));

    try {
      executor.submit(new RunnableTask("task2"));
    } catch (RejectedExecutionException e) {
      log("요청 초과");
      // 포기, 다시 시도 등 다양한 고민을 하면 됨
      log(e);
    }

    executor.close();
  }

}
