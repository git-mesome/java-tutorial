package com.example.java_adv1.thread.executor;

import static com.example.java_adv1.thread.executor.ExecutorUtils.printState;
import static com.example.java_adv1.util.MyLogger.log;
import static com.example.java_adv1.util.ThreadUtils.sleep;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ExecutorBasicMain {

  public static void main(String[] args) {
    ExecutorService es = new ThreadPoolExecutor(
        3,
        4,
        0,
        TimeUnit.MILLISECONDS,
        new LinkedBlockingQueue<>()
    );
    log("==초기 상태==");
    printState(es);
    es.execute(new RunnableTask("taskA"));
    es.execute(new RunnableTask("taskB"));
    es.execute(new RunnableTask("taskC"));
    es.execute(new RunnableTask("taskD"));
    log("==작업 수행 중==");
    printState(es);

    sleep(3000);
    log("==작업 수행 완료==");
    printState(es);

    es.close();
    log("==shotdown 완료==");
    printState(es);


  }

}
