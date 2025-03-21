package com.example.java_adv2.network.exception.connect;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;

public class ConnectMain {

  public static void main(String[] args) throws IOException {
    unknownHostEx1();
    unknownHostEx2();
    connectionRefused();
  }

  private static void unknownHostEx1() {
    try {
      Socket socket = new Socket("999.999.999.999", 80);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void unknownHostEx2() {
    try {
      Socket socket = new Socket("google.ggg", 80);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static void connectionRefused() throws IOException {
    try {
      Socket socket = new Socket("localhost", 45678);
    } catch (ConnectException e) {
      e.printStackTrace();
    }
  }

}
