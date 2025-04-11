package java_adv1.thread.start;

import static java_adv1.util.MyLogger.log;

public class InnerRunnableMainV1 {

  public static void main(String[] args) {
    log("main() start");

    final Runnable runnable = new MyRunnable();
    new Thread(runnable).start();

    log("main() end");
  }

  private static class MyRunnable implements Runnable {
    @Override
    public void run() {
      log("run()");
    }
  }
}
