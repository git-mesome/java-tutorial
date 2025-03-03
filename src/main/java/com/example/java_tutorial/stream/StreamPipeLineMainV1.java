package com.example.java_tutorial.stream;

import java.util.List;

public class StreamPipeLineMainV1 {

  public static void main(String[] args) {
    List<Student> list = List.of(
        new Student("John", 20),
        new Student("Mary", 30),
        new Student("Sam", 40)
    );

    double avg = list.stream()
        .mapToInt(Student::getScore)
        .average()
        .getAsDouble();

    System.out.println("Average score: " + avg);


  }

}
