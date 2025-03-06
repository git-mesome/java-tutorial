package com.example.java_adv1.thread.executor;

import static com.example.java_adv1.thread.executor.ExecutorUtils.printState;
import static com.example.java_adv1.util.MyLogger.log;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorShutdownMain {

  public static void main(String[] args) {
    ExecutorService es = Executors.newFixedThreadPool(2);
    es.execute(new RunnableTask("taskA"));
    es.execute(new RunnableTask("taskB"));
    es.execute(new RunnableTask("taskC"));
    es.execute(new RunnableTask("longTask", 100_000));
    printState(es);
    log("== shutdown 시작 ==");
    shutdownAndAwaitTermination(es);
    log("== shutdown 완료 ==");
    printState(es);
  }

  private static void shutdownAndAwaitTermination(ExecutorService es) {
    es.shutdown(); // non-blocking
    try {
      // 이미 대기중인 작업을 모두 완료할 때까지 10초 기다린다.
      if (!es.awaitTermination(10, TimeUnit.SECONDS)) { //blocking
        log("서비스 정상 종료 실패 -> 강제 종료 시도");
        es.shutdownNow();
        // 작업 취소될 때 까지 대기
        if (!es.awaitTermination(10, TimeUnit.SECONDS)) {
          log("서비스가 종료되지 않았습니다.");
        }
      }
    } catch (InterruptedException e) {
      // awaitTermination() 대기중인 현재 스레드가 인터럽트가 될 수 있음
      es.shutdownNow();
    }
  }

}
