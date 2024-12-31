package com.example.java_tutorial.exception.basic.unchecked;

import com.example.java_tutorial.exception.basic.checked.MyCheckedException;

/***
 * UnChecked 예외는
 * 예외를 잡거나, 던지지 않아도 된다.
 * 예외를 잡지 않으면 자동으로 밖으로 던진다.
 */
public class Service {
  Client client = new Client();

  /**
   * 필요한 경우 예외를 잡아서 처리하면 된다.
   */
  public void callCatch() {
    try {
      client.call();
    } catch (MyUnCheckedException e) {
      System.out.println("예외 처리, message=" + e.getMessage());
    }
    System.out.println("정상 흐름");
  }

  /**
   * 예외를 잡지 않아도 된다. 상위로 자연스럽게 넘어간다.
   * throws 예외를 선언 안해도 된다.
   */
  public void callThrow(){
    client.call();
  }

}
