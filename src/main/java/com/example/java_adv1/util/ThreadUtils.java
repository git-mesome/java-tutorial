package com.example.java_adv1.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.example.java_adv1.util.MyLogger.log;

public abstract class ThreadUtils {


  public static void sleep(long millis) {
    try {
      Thread.sleep(millis);
    }
    catch (InterruptedException e) {
      log("인터럽트 발생, " + e.getMessage());
      throw new RuntimeException(e);
    }
  }

}
