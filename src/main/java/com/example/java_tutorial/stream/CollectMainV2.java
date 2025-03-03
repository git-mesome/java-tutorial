package com.example.java_tutorial.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectMainV2 {

  public static void main(String[] args) {
    List<StudentV2> totalList = new ArrayList<>();
    totalList.add(new StudentV2("홍길동", "남", 92));
    totalList.add(new StudentV2("김수영", "여", 87));
    totalList.add(new StudentV2("감자바", "남", 95));
    totalList.add(new StudentV2("오해영", "여", 93));

    Map<String, List<StudentV2>> map = totalList.stream()
        .collect(
            Collectors.groupingBy(StudentV2::getSex
//                ,Collectors.averagingDouble(StudentV2::getScore)
            )
        );

    System.out.println(map);

    List<StudentV2> maleList = map.get("남");
    maleList.stream()
        .forEach(student -> System.out.println(student.getName()));
    System.out.println();

    List<StudentV2> femaleList = map.get("여");
    femaleList.stream()
        .forEach(student -> System.out.println(student.getName()));

  }

}
