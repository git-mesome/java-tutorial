package com.example.java_tutorial.time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {
  /** 입력 조건: 년도, 월 실행시 날짜의 간격에는 신경을 쓰지 않아도 된다. 간격을 맞추는 부분은 정답을 참고하자. */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("년도를 입력하세요: ");
    int year = scanner.nextInt();
    System.out.print("월을 입력하세요: ");
    int month = scanner.nextInt();

    printCalendar(year, month);
  }

  private static void printCalendar(int year, int month) {
    LocalDate firstDayOfMonth = LocalDate.of(year, month, 1);
    LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);

    // 월요일 =1(1%7=1) ... 6%7일요일 7
    int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;
    System.out.println(firstDayOfMonth.getDayOfWeek().getValue());
    System.out.println("Su Mo Tu We Th Fr Sa ");

    for (int i = 0; i < offsetWeekDays; i++) {
      System.out.print("   ");
    }

    LocalDate dayIterator = firstDayOfMonth;
    while (dayIterator.isBefore(firstDayOfNextMonth)) {
      // %2d 오른쪽으로 맞춰서 나오는 것/ 2칸을 차지해라는 뜻
      System.out.printf("%2d ", dayIterator.getDayOfMonth());
      if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
        System.out.println();
      }
      dayIterator = dayIterator.plusDays(1);
    }
  }
}
