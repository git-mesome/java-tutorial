package com.example.java_adv2.io.text;

import static com.example.java_adv2.io.text.TextConst.FILE_NAME;
import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriterMainV3 {

  public static void main(String[] args) throws IOException {
    String writeString = "ABC";
    System.out.println("write string = " + writeString);

    FileWriter fw = new FileWriter(FILE_NAME); // 기본 인코딩 셋 사용 : UTF-8(for mac)
    fw.write(writeString);
    fw.close();

    StringBuilder content = new StringBuilder();
    FileReader fr = new FileReader(FILE_NAME, UTF_8);
    int ch;
    while ((ch = fr.read()) != -1) {
      content.append((char) ch);
    }
    fr.close();

    System.out.println("read string = " + content);
  }

}
