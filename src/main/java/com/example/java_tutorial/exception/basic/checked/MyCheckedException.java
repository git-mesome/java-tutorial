package com.example.java_tutorial.exception.basic.checked;

/**
 * Exception 을 상속받은 예외는 체크 예외
 * 단, RuntimeException은 제외
 */
public class MyCheckedException extends Exception{
  public MyCheckedException(String message) {
    super(message);
  }
}
