package com.example.java_adv1.thread.bounded;

import static com.example.java_adv1.util.MyLogger.log;
import java.util.concurrent.BlockingQueue;

public class ConsumerTask implements Runnable {

  private final BlockingQueue<String> queue;

  public ConsumerTask(BlockingQueue<String> queue) {
    this.queue = queue;
  }

  @Override
  public void run() {
    log("[소비 시도]     ? <- " + queue);
    String data = null;

    // 1. 대기
//    try {
//      data = queue.take();
//    } catch (InterruptedException e) {
//      throw new RuntimeException(e);
//    }

    // 2. 대기시 반환 (시간, TimeUnit.XXX))
//    queue.poll();

    // 3. 예외 반환
    queue.remove();
    log("[소비 완료] " + data + " <- " + queue);
  }
}
