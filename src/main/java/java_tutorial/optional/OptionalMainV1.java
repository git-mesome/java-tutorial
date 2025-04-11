package java_tutorial.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalMainV1 {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    /** NoSuchElementException
     double avg = list.stream()
     .mapToInt(Integer::intValue)
     .average()
     .getAsDouble();
     */

    // 방법 1
    OptionalDouble optional = list.stream()
        .mapToInt(Integer::intValue)
        .average();
    if (optional.isPresent()) {
      System.out.println("평균 = " + optional.getAsDouble());
    } else {
      System.out.println("평균 = 0.0");
    }

    // 방법 2
    double avg = list.stream()
        .mapToInt(Integer::intValue)
        .average()
        .orElse(0.0);
    System.out.println("avg = " + avg);

    // 방법 3
    list.stream()
        .mapToInt(Integer::intValue)
        .average()
        .ifPresent(a -> System.out.println("평균 = " + a));


  }

}
