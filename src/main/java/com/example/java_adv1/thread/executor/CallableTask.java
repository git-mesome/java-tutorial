package com.example.java_adv1.thread.executor;

import static com.example.java_adv1.util.MyLogger.log;
import static com.example.java_adv1.util.ThreadUtils.sleep;
import java.util.concurrent.Callable;

public class CallableTask implements Callable<Integer> {

  private String name;
  private int sleepMs = 1000;

  public CallableTask(String name, int sleepMs) {
    this.name = name;
    this.sleepMs = sleepMs;
  }

  @Override
  public Integer call() throws Exception {
    log(name + " 실행");
    sleep(sleepMs);
    log(name + " 완료");
    return sleepMs;
  }
}
