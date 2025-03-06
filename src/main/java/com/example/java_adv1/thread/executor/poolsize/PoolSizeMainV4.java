package com.example.java_adv1.thread.executor.poolsize;

import static com.example.java_adv1.thread.executor.ExecutorUtils.printState;
import com.example.java_adv1.thread.executor.RunnableTask;
import static com.example.java_adv1.util.MyLogger.log;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class PoolSizeMainV4 {

  //  static final int TASK_SIZE = 1100;  // 1. 일반
//  static final int TASK_SIZE = 1200; // 2. 긴급
  static final int TASK_SIZE = 1201; // 3. 거절

  public static void main(String[] args) {
    ExecutorService es = new ThreadPoolExecutor(
        100,
        200,
        60,
        TimeUnit.SECONDS,
        new ArrayBlockingQueue<>(1000));

    printState(es);

    long startMs = System.currentTimeMillis();
    for (int i = 1; i <= TASK_SIZE; i++) {
      String taskName = "task-" + i;
      try {
        es.execute(new RunnableTask(taskName));
        printState(es, taskName);
      } catch (RejectedExecutionException e) {
        log(taskName + " - > " + e);
      }
    }

    es.close();
    long endMs = System.currentTimeMillis();
    log("time: " + (endMs - startMs));


  }

}
