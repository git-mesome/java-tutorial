package com.example.java_tutorial.time.test;

import java.time.*;

public class TestZone {
  /** 서울의 회의 시간은 2024년 1월 1일 오전 9시다. 이때 런던, 뉴욕의 회의 시간을 구해라. */
  public static void main(String[] args) {
    ZonedDateTime seoulTime =
        ZonedDateTime.of(LocalDateTime.of(2024, 1, 1, 9, 0), ZoneId.of("Asia/Seoul"));
    //    ZonedDateTime seoulTime = ZonedDateTime.of(LocalDate.of(2024, 1, 1),
    //        LocalTime.of(9, 0), ZoneId.of("Asia/Seoul"));

    ZonedDateTime londonTime = seoulTime.withZoneSameInstant(ZoneId.of("Europe/London"));
    ZonedDateTime nyTime = seoulTime.withZoneSameInstant(ZoneId.of("America/New_York"));

    System.out.println("seoulTime = " + seoulTime);
    System.out.println("londonTime = " + londonTime);
    System.out.println("nyTime = " + nyTime);
  }
}
