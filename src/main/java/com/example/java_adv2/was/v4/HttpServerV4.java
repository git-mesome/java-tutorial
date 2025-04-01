package com.example.java_adv2.was.v4;

import static com.example.java_adv2.util.MyLogger.log;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HttpServerV4 {

  private final ExecutorService es = Executors.newFixedThreadPool(10);
  private final int port;

  public HttpServerV4(int port) {
    this.port = port;
  }

  public void start() throws IOException {
    ServerSocket serverSocket = new ServerSocket(port);
    log("서버 시작 port: " + port);

    while (true) {
      Socket socket = serverSocket.accept();
      es.submit(new HttpRequestHandlerV4(socket));
    }
  }
}
