package com.example.java_adv2.network.tcp.v4;

import static com.example.java_adv2.network.tcp.SocketCloseUtil.closeAll;
import static com.example.java_adv2.util.MyLogger.log;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class SessionV4 implements Runnable {

  private final Socket socket;

  public SessionV4(Socket socket) {
    this.socket = socket;
  }

  @Override
  public void run() {
    DataInputStream input = null;
    DataOutputStream output = null;
    try {
      input = new DataInputStream(socket.getInputStream());
      output = new DataOutputStream(socket.getOutputStream());

      while (true) {
        String received = input.readUTF();
        log("client -> server: " + received);

        if (received.equals("exit")) {
          break;
        }

        String toSend = received + " World!";
        output.writeUTF(toSend);
        log("client <- server: " + toSend);
      }
    } catch (IOException e) {
      log(e);
    } finally {
      closeAll(socket, input, output);
      log("연결 종료:  " + socket);
    }
  }
}
