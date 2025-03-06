package com.example.java_adv1.thread.executor.poolsize;

import static com.example.java_adv1.thread.executor.ExecutorUtils.printState;
import com.example.java_adv1.thread.executor.RunnableTask;
import static com.example.java_adv1.util.MyLogger.log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolSizeMainV2 {

  public static void main(String[] args) {
    ExecutorService es = Executors.newFixedThreadPool(2);

    log("pool 생성");
    printState(es);

    for (int i = 1; i <= 6; i++) {
      String taskName = "task" + i;
      es.execute(new RunnableTask(taskName));
      printState(es, taskName);
    }
    es.close();
    log("== shutdown 완료 ==");
  }

}
