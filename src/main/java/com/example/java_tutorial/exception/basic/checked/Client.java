package com.example.java_tutorial.exception.basic.checked;

public class Client {
  public void call() throws MyCheckedException {

    //예외 발생
    throw new MyCheckedException("ex");
  }
}
