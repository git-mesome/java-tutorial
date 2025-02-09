package com.example.java_adv1.thread.control;

import com.example.java_adv1.util.ThreadUtils;

import static com.example.java_adv1.util.ThreadUtils.*;

public class CheckedExceptionMain {

  public static void main(String[] args) throws Exception {
    throw new Exception();
  }

  static class CheckedRunnable implements Runnable {

    @Override
    public void run() /*throws Exception*/{
      // throw new Exception(); // 주석 풀면 예외 발생
    }
  }
}
