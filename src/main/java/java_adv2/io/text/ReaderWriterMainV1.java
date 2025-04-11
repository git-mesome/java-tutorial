package java_adv2.io.text;

import static java_adv2.io.text.TextConst.FILE_NAME;
import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ReaderWriterMainV1 {

  public static void main(String[] args) throws IOException {
    String writeString = "ABC";
    // 문자 -> byte UTF-8 인코딩
    byte[] writeBytes = writeString.getBytes(UTF_8);
    System.out.println("writeString = " + writeString);
    System.out.println("writeBytes = " + Arrays.toString(writeBytes));

    //파일에 쓰기
    FileOutputStream fos = new FileOutputStream(FILE_NAME);
    fos.write(writeBytes);
    fos.close();

    //파일 읽기
    FileInputStream fis = new FileInputStream(FILE_NAME);
    byte[] readAllBytes = fis.readAllBytes();
    fis.close();

    // byte -> String UTF-8 디코딩
    String readString = new String(readAllBytes, UTF_8);
    System.out.println("readAllBytes = " + Arrays.toString(readAllBytes));
    System.out.println("readString = " + readString);

  }

}
