package com.example.java_tutorial;

import java.util.stream.LongStream;

public class SteamTest {
  public static void main(String[] args) {
    final long start1 = System.currentTimeMillis();
    final long result1 =
        LongStream.rangeClosed(1, 1_000)
            .map(
                i -> {
                  // System.out.println("Thread: " + Thread.currentThread().getName() + ", value: "
                  // + i);
                  return i;
                })
            .sum();

    System.out.println("Sum: " + result1);
    System.out.println("Time: " + (System.currentTimeMillis() - start1) + "ms");

    final long start2 = System.currentTimeMillis();
    final long result2 =
        LongStream.rangeClosed(1, 1_000)
            .parallel()
            .map(
                i -> {
                  // System.out.println("Thread: " + Thread.currentThread().getName() + ", value: "
                  // + i);
                  return i;
                })
            .sum();

    System.out.println("Sum: " + result2);
    System.out.println("Time: " + (System.currentTimeMillis() - start2) + "ms");
  }
}
