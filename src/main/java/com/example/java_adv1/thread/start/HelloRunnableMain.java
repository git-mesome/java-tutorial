package com.example.java_adv1.thread.start;

public class HelloRunnableMain {

  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName() + ": main() start");

    HelloRunnable runnable = new HelloRunnable();
    final Thread thread = new Thread(runnable);
    thread.start();

    System.out.println(Thread.currentThread().getName() + ": main() end");
  }
}
