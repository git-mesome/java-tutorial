package com.example.java_tutorial.stream;

import java.util.ArrayList;
import java.util.List;

public class MappingMainV1 {

  public static void main(String[] args) {
    List<Student> studentList = new ArrayList<>();
    studentList.add(new Student("Bob", 30));
    studentList.add(new Student("John", 40));
    studentList.add(new Student("Jane", 40));

    studentList.stream()
        .mapToInt(Student::getScore)
        .forEach(System.out::println);
  }

}
