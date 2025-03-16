package com.example.java_adv2.network.tcp.v5;

import static com.example.java_adv2.util.MyLogger.log;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerV5 {

  private static final int PORT = 12345;

  public static void main(String[] args) throws IOException {
    log("서버 시작");
    ServerSocket serverSocket = new ServerSocket(PORT);
    log("서버 소켓 시작 - 리스닝 포트: " + PORT);

    while (true) {
      Socket socket = serverSocket.accept(); // blocking
      log("소켓 연결: " + socket);

      SessionV5 session = new SessionV5(socket);
      Thread thread = new Thread(session);
      thread.start();
    }
  }
}
