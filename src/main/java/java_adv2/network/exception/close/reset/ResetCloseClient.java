package java_adv2.network.exception.close.reset;

import static java_adv2.util.MyLogger.log;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;

public class ResetCloseClient {

  public static void main(String[] args) throws IOException, InterruptedException {
    Socket socket = new Socket("localhost", 12345);
    log("소켓 연결: " + socket);
    InputStream input = socket.getInputStream();
    OutputStream output = socket.getOutputStream();

    // client <- server: FIN
    Thread.sleep(1000);

    // client -> server : PUSH[1]
    output.write(1);

    // client <- server : RST(reset)
    Thread.sleep(1000); // RST 메시지 전송 대기

    try {
      // java.net.SocketException: Connection reset
      int read = input.read();
      System.out.println("read = " + read);
    } catch (SocketException e) {
      e.printStackTrace();
    }

    try {
      // java.net.SocketException: Broken pipe
      output.write(1);
    } catch (SocketException e) {
      e.printStackTrace();
    }

    log("연결 종료: " + socket.isClosed());
  }
}
