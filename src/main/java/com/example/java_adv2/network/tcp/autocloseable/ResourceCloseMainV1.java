package com.example.java_adv2.network.tcp.autocloseable;

public class ResourceCloseMainV1 {

  public static void main(String[] args) {
    try {
      logic();
    } catch (CallException e) {
      System.out.println("call exception 예외 처리");
      throw new RuntimeException(e);
    } catch (CloseException e) {
      System.out.println("close exception 예외 처리");
      throw new RuntimeException(e);
    }
  }

  private static void logic() throws CallException, CloseException {
    ResourceV1 resource1 = new ResourceV1("resource1");
    ResourceV1 resource2 = new ResourceV1("resource2");

    resource1.call();
    resource1.callEx();

    System.out.println("자원 정리");
    resource2.closeEx();
    resource1.close();
  }

}
