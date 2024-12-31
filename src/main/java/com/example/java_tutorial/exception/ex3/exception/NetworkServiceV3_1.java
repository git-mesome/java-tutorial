package com.example.java_tutorial.exception.ex3.exception;


public class NetworkServiceV3_1 {

  public void sendMessage(String data) {
    String address = "http://example.com";

    NetworkClientV3 client = new NetworkClientV3(address);
    client.initError(data);

    try {
      client.connect();
      client.send(data);
    } catch (ConnectExceptionV3 e) {
      System.out.println("[연결 오류] 주소: " + e.getAddress()+ ", 메시지: " + e.getMessage());
    } catch (SendExceptionV3 e) {
      System.out.println("[오류] 데이터: " + e.getSendData() + ", 메시지: " + e.getMessage());
    }
    //NetworkClientException 이 아닌 다른 예외가 발생해서 예외가 밖으로 던져지면 무시
    client.disconnect();
  }
}
