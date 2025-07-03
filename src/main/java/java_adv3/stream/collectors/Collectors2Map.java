package java_adv3.stream.collectors;

import static java.util.stream.Collectors.toMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Collectors2Map {

  public static void main(String[] args) {
    Map<String, Integer> map1 = Stream.of("Apple", "Banana", "Cherry")
        .collect(toMap(
            name -> name,
            name -> name.length()
        ));
    System.out.println("map1 = " + map1);

    // 키 중복 예외 : IllegalStateException : Duplicate key Apple
//    Map<String, Integer> map2 = Stream.of("Apple", "Apple", "Cherry")
//        .collect(toMap(
//            name -> name,
//            name -> name.length()
//        ));
//    System.out.println("map2 = " + map2);

    // 키 중복 대안(병합)
    Map<String, Integer> map3 = Stream.of("Apple", "Apple", "Cherry")
        .collect(toMap(
            name -> name,
            name -> name.length(),
            (oldValue, newValue) -> oldValue + newValue
        ));
    System.out.println("map3 = " + map3);

    //  Map 타입 지정
    LinkedHashMap<String, Integer> mapt4 = Stream.of("Apple", "Apple", "Cherry")
        .collect(toMap(
            name -> name,
            String::length,
            (oldValue, newValue) -> oldValue + newValue,
            LinkedHashMap::new
        ));
    System.out.println("mapt4 = " + mapt4.getClass());

  }

}
