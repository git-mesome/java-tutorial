package java_adv1.thread.start;

import static java_adv1.util.MyLogger.log;

public class ManyThreadMainV2 {

  public static void main(String[] args) {
    log("main() start");

    final HelloRunnable runnable = new HelloRunnable();
    for (int i = 0; i < 100; i++) {
      final Thread thread1 = new Thread(runnable);
      thread1.start();
    }

    log("main() end");
  }
}
