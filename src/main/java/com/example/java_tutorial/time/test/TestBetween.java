package com.example.java_tutorial.time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
  /** 시작 날짜와 목표 날짜를 입력해서 남은 기간과 디데이를 구해라 남은 기간: x년 x개월 x일 형식으로 출력한다. 디데이: x일 남은 형식으로 출력한다. */
  public static void main(String[] args) {
    LocalDate startDate = LocalDate.of(2024, 1, 1);
    LocalDate endDate = LocalDate.of(2024, 11, 21);

    Period period = Period.between(startDate, endDate);
    long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
    System.out.println("daysBetween = " + daysBetween);
    System.out.println(period.getYears());
    System.out.println(period.getMonths());
    System.out.println(period.getDays());
  }
}
