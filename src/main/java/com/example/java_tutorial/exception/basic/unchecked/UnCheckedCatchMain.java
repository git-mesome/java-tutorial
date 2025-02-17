package com.example.java_tutorial.exception.basic.unchecked;

public class UnCheckedCatchMain {
  public static void main(String[] args) {
    Service service = new Service();
    //    service.callCatch();
    service.callThrow();
    System.out.println("정상 종료");
  }
}
