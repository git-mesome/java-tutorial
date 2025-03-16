package com.example.java_adv2.network.tcp;

import static com.example.java_adv2.util.MyLogger.log;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SocketCloseUtil {

  public static void closeAll(Socket socket, InputStream input, OutputStream output) {
    close(input);
    close(output);
    close(socket);
  }

  public static void close(OutputStream output) {
    if (output != null) {
      try {
        output.close();
      } catch (IOException e) {
        log(e.getMessage());
      }
    }
  }

  public static void close(InputStream input) {
    if (input != null) {
      try {
        input.close();
      } catch (IOException e) {
        log(e.getMessage());
      }
    }
  }

  public static void close(Socket socket) {
    if (socket != null) {
      try {
        socket.close();
      } catch (IOException e) {
        log(e.getMessage());
      }
    }
  }

}
