package java_tutorial.stream;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamMainV5 {

  public static void main(String[] args) throws URISyntaxException, IOException {
    Path path = Paths.get(StreamMainV5.class.getResource(
            "/data.txt")
        .toURI());

    Stream<String> stream = Files.lines(path, Charset.defaultCharset());
    stream.forEach(System.out::println);
    stream.close();

  }

}
