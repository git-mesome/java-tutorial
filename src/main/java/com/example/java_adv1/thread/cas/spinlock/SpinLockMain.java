package com.example.java_adv1.thread.cas.spinlock;

import static com.example.java_adv1.util.MyLogger.log;

public class SpinLockMain {

  public static void main(String[] args) {
//    SpinLockBad spinLock = new SpinLockBad();
    SpinLock spinLock = new SpinLock();

    Runnable task = () -> {
      spinLock.lock();
      try {
        // 임계 영역
        log("비즈니스 로직 실행");
      } finally {
        spinLock.unlock();
      }
    };

    new Thread(task, "Thread-1").start();
    new Thread(task, "Thread-2").start();
  }

}
