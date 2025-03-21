package com.example.java_adv1.thread.bounded;

import static com.example.java_adv1.util.MyLogger.log;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BoundedQueueV6_3 implements BoundedQueue {

  private BlockingQueue<String> queue;

  public BoundedQueueV6_3(int max) {
    this.queue = new ArrayBlockingQueue<>(max);
  }

  @Override
  public void put(String data) {
    try {
      boolean result = queue.offer(data, 1, TimeUnit.NANOSECONDS);
      log("저장 시도 결과 = " + result);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public String take() {
    try {
      return queue.poll(2, TimeUnit.SECONDS);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public String toString() {
    return queue.toString();
  }
}
