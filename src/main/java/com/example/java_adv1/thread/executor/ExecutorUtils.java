package com.example.java_adv1.thread.executor;

import static com.example.java_adv1.util.MyLogger.log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public abstract class ExecutorUtils {

  public static void printState(ExecutorService executorService) {
    // ThreadPoolExecutor executor = (ThreadPoolExecutor) executorService;
    if (executorService instanceof ThreadPoolExecutor poolExecutor) {
      // 스레드 풀에서 관리되는 스레드 수
      int pool = poolExecutor.getPoolSize();
      // 작업 수행하는 스레드 수
      int active = poolExecutor.getActiveCount();
      // 큐에 대기중인 작업의 수
      int queuedTasks = poolExecutor.getQueue().size();
      // 완료된 작업의 수
      long completedTask = poolExecutor.getCompletedTaskCount();
      log("[pool=" + pool +
          ", active=" + active +
          ", queuedTasks=" + queuedTasks +
          ", completedTask=" + completedTask + "]");
    } else {
      log(executorService);
    }
  }

  public static void printState(ExecutorService executorService, String taskName) {
    // ThreadPoolExecutor executor = (ThreadPoolExecutor) executorService;
    if (executorService instanceof ThreadPoolExecutor poolExecutor) {
      // 스레드 풀에서 관리되는 스레드 수
      int pool = poolExecutor.getPoolSize();
      // 작업 수행하는 스레드 수
      int active = poolExecutor.getActiveCount();
      // 큐에 대기중인 작업의 수
      int queuedTasks = poolExecutor.getQueue().size();
      // 완료된 작업의 수
      long completedTask = poolExecutor.getCompletedTaskCount();
      log(taskName + " -> [pool=" + pool +
          ", active=" + active +
          ", queuedTasks=" + queuedTasks +
          ", completedTask=" + completedTask + "]");
    } else {
      log(executorService);
    }
  }

}
