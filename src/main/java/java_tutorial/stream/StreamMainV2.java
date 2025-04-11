package java_tutorial.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMainV2 {

  public static void main(String[] args) {
    List<Product> list = new ArrayList<>();
    for (int i = 1; i < 6; i++) {
      Product product = new Product(i, "상품" + i, "멋진 회사", (int) (10000 * Math.random()));
      list.add(product);
    }

    Stream<Product> stream = list.stream();
    stream.forEach(System.out::println);
  }

}
