package java_tutorial.exception.ex1;

public class NetworkServiceV1_1 {

  public void sendMessage(String data) {
    String address = "http://example.com";
    NetworkClientV1 clinet = new NetworkClientV1(address);
    clinet.initError(data);

    clinet.connect();
    clinet.send(data);
    clinet.disconnect();
  }
}
