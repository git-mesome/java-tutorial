package com.example.java_adv2.was.httpserver;

public class PageNotFoundException extends RuntimeException {

  public PageNotFoundException(String message) {
    super(message);
  }
}
