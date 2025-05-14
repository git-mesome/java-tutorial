package java_adv3.lambda.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class MapExample {

  public static List<String> map(List<String> list, UnaryOperator<String> func) {
    List<String> result = new ArrayList<>();
    for (String val : list) {
      result.add(func.apply(val));
    }
    return result;
  }

  public static void main(String[] args) {
    List<String> words = List.of("hello", "java", "lambda");
    System.out.println("원본 리스트: " + words);

    System.out.println("대문자 변환: " + map(words, value -> value.toUpperCase()));
    System.out.println("특수문자 데코 결과" + map(words, value -> "****" + value + "****"));
  }

}
