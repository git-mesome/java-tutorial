package java_tutorial.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamMainV1 {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("1");
    list.add("2");
    list.add("3");
    list.add("4");
    list.add("5");

    Stream<String> parallelStream = list.parallelStream();
    parallelStream.forEach(name ->
        System.out.println(name + ": " + Thread.currentThread().getName())
    );
  }

}
