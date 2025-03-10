package com.example.java_adv2.io.start;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayStreamMain {

  // 사실 컬렉션을 쓰면 된다.
  public static void main(String[] args) throws IOException {
    byte[] bytes = {1, 2, 3};

    ByteArrayOutputStream bos = new ByteArrayOutputStream();
    bos.write(bytes);

    ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
    byte[] readAllBytes = bis.readAllBytes();
    System.out.println("readAllBytes = " + Arrays.toString(readAllBytes));

  }

}
