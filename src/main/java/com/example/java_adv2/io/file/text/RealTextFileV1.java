package com.example.java_adv2.io.file.text;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class RealTextFileV1 {

  private static final String PATH = "temp/hello2.txt";

  public static void main(String[] args) throws IOException {
    String writeString = "abc\n가나다";
    System.out.println("== writeString ==");
    System.out.println(writeString);

    Path path = Path.of(PATH);

    Files.writeString(path, writeString, UTF_8);
    String readString = Files.readString(path, UTF_8);

    System.out.println("== readString ==");
    System.out.println(readString);

  }

}
