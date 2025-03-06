package com.example.java_adv1.thread.executor.future;

import com.example.java_adv1.thread.executor.CallableTask;
import static com.example.java_adv1.util.MyLogger.log;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InvokeAnyMain {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService es = Executors.newFixedThreadPool(10);

    CallableTask task1 = new CallableTask("task1", 1000);
    CallableTask task2 = new CallableTask("task2", 2000);
    CallableTask task3 = new CallableTask("task3", 3000);
    List<CallableTask> tasks = List.of(task1, task2, task3);

    Integer value = es.invokeAny(tasks);
    log("value = " + value);

    es.close();
  }

}
