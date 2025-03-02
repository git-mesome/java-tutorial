package com.example.java_adv1.thread.bounded;

import static com.example.java_adv1.util.MyLogger.log;
import java.util.concurrent.BlockingQueue;

public class ProducerTask implements Runnable {

  private final BlockingQueue<String> queue;
  private final String request;

  public ProducerTask(BlockingQueue<String> queue, String request) {
    this.queue = queue;
    this.request = request;
  }

  @Override
  public void run() {
    log("[생산 시도] " + request + " -> " + queue);
    // 1. 대기
//    try {
//      queue.put(request);
//    } catch (InterruptedException e) {
//      throw new RuntimeException(e);
//    }

    // 2. 대기시 반환
//    boolean result = queue.offer(request);
//    log("저장 시도 결과 = " + result);

    // 3. 예외 반환
    queue.add(request);
    log("[생산 완료] " + request + " -> " + queue);
  }
}