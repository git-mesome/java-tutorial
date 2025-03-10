package com.example.java_adv2.io.text;

import static com.example.java_adv2.io.text.TextConst.FILE_NAME;
import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ReaderWriterMainV2 {

  public static void main(String[] args) throws IOException {
    String writeString = "abc";
    // 문자 -> byte UTF-8 인코딩

    // 파일에 쓰기
    FileOutputStream fos = new FileOutputStream(FILE_NAME);
    OutputStreamWriter osw = new OutputStreamWriter(fos, UTF_8);

    osw.write(writeString);
    osw.close();

    FileInputStream fis = new FileInputStream(FILE_NAME);
    InputStreamReader isr = new InputStreamReader(fis, UTF_8);

    StringBuilder content = new StringBuilder();
    int ch;
    while ((ch = isr.read()) != -1) {
      content.append((char) ch);
    }
    isr.close();

    System.out.println("read String = " + content);


  }

}
