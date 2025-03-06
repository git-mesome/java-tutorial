package com.example.java_adv1.thread.executor.poolsize;

import static com.example.java_adv1.thread.executor.ExecutorUtils.printState;
import com.example.java_adv1.thread.executor.RunnableTask;
import static com.example.java_adv1.util.MyLogger.log;
import static com.example.java_adv1.util.ThreadUtils.sleep;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PoolSizeMainV3 {

  public static void main(String[] args) {
    ExecutorService es = Executors.newCachedThreadPool();

    log("pool 생성");
    printState(es);

    for (int i = 1; i <= 6; i++) {
      String taskName = "task" + i;
      es.execute(new RunnableTask(taskName));
      printState(es, taskName);
    }
    sleep(3000);
    log("== 작업 수행 완료 ==");

    sleep(56_000);
    log("== maximumPoolSize 대기 시간 초과 ==");
    printState(es);

    es.close();
    log("== shutdown 완료 ==");
    printState(es);

  }

}
