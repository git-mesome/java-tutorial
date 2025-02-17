package com.example.java_tutorial.exception.ex0;

public class NetworkServiceV0 {

  public void sendMessage(String data) {
    String address = "http://example.com";
    NetworkClientV0 clinet = new NetworkClientV0(address);

    clinet.connect();
    clinet.send(data);
    clinet.disconnect();
  }
}
