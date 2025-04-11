package java_tutorial.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectMainV1 {

  public static void main(String[] args) {
    List<StudentV2> totalList = new ArrayList<>();
    totalList.add(new StudentV2("홍길동", "남", 92));
    totalList.add(new StudentV2("김수영", "여", 87));
    totalList.add(new StudentV2("감자바", "남", 95));
    totalList.add(new StudentV2("오해영", "여", 93));

    List<StudentV2> maleList = totalList.stream()
        .filter(s -> s.getSex().equals("남"))
        .toList();

    maleList.stream()
        .forEach(s -> System.out.println(s.getName()));

    System.out.println();

    Map<String, Integer> map = totalList.stream()
        .collect(
            Collectors.toMap(
                StudentV2::getName,
                StudentV2::getScore
            )
        );

    System.out.println(map);
  }

}
