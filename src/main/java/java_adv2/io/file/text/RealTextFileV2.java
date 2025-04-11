package java_adv2.io.file.text;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class RealTextFileV2 {

  private static final String PATH = "temp/hello2.txt";

  public static void main(String[] args) throws IOException {
    String writeString = "abc\n가나다";
    System.out.println("== writeString ==");
    System.out.println(writeString);

    Path path = Path.of(PATH);

    Files.writeString(path, writeString, UTF_8);
    System.out.println("== readString ==");
    Stream<String> lines = Files.lines(path, UTF_8);
    lines.forEach(System.out::println);
    lines.close();

//    List<String> lines = Files.readAllLines(path, UTF_8);
//    for (int i = 0; i < lines.size(); i++) {
//      System.out.println((i + 1) + ": " + lines.get(i));
//    }

  }

}
