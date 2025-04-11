package java_tutorial.exception.ex1;

public class NetworkServiceV1_2 {

  private static boolean isError(String resultCode) {
    return !resultCode.equals("success");
  }

  public void sendMessage(String data) {
    NetworkClientV1 clinet = new NetworkClientV1("http://example.com");
    clinet.initError(data);

    String connectResult = clinet.connect();

    // 결과가 성공이 아니다 -> 오류다
    if (isError(connectResult)) {
      System.out.println("[네트워크 오류 발생] 오류 코드: " + connectResult);
      return;
    }

    String sendResult = clinet.send(data);
    if (isError(sendResult)) {
      System.out.println("[네트워크 오류 발생] 오류 코드: " + sendResult);
      return;
    }

    clinet.disconnect();
  }
}
