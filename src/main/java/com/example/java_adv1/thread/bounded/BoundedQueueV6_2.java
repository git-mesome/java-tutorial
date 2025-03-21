package com.example.java_adv1.thread.bounded;

import static com.example.java_adv1.util.MyLogger.log;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BoundedQueueV6_2 implements BoundedQueue {

  private BlockingQueue<String> queue;

  public BoundedQueueV6_2(int max) {
    this.queue = new ArrayBlockingQueue<>(max);
  }

  @Override
  public void put(String data) {
    boolean result = queue.offer(data);
    log("저장 시도 결과 = " + result);
  }

  @Override
  public String take() {
    return queue.poll();
  }

  @Override
  public String toString() {
    return queue.toString();
  }
}
