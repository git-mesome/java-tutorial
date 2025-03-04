package com.example.java_tutorial.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ParallelMainV1 {

  public static void main(String[] args) {
    Random random = new Random();

    List<Integer> scores = new ArrayList<>();
    for (int i = 0; i < 100_000_000; i++) {
      scores.add(random.nextInt(101));
    }

    double avg = 0.0;
    long startTime = 0;
    long endTime = 0;
    long time = 0;

    Stream<Integer> stream = scores.stream();
    startTime = System.nanoTime();
    avg = stream
        .mapToInt(Integer::intValue)
        .average()
        .getAsDouble();
    endTime = System.nanoTime();
    time = endTime - startTime;
    System.out.println("avg = " + avg + ", 일반 스트림 처리 시간 = " + time + "ns");

    Stream<Integer> parallelStream = scores.parallelStream();
    startTime = System.nanoTime();
    avg = parallelStream
        .mapToInt(Integer::intValue)
        .average()
        .getAsDouble();
    endTime = System.nanoTime();
    time = endTime - startTime;
    System.out.println("avg = " + avg + ", 병렬 스트림 처리 시간 = " + time + "ns");


  }

}
