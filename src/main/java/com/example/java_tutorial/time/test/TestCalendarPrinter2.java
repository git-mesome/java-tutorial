package com.example.java_tutorial.time.test;

import java.util.Scanner;


public class TestCalendarPrinter2 {
  /**
   * 입력 조건: 년도, 월
   * 실행시 날짜의 간격에는 신경을 쓰지 않아도 된다. 간격을 맞추는 부분은 정답을 참고하자.
   */
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("년도를 입력하세요: ");
    int year = scanner.nextInt();
    System.out.print("월을 입력하세요: ");
    int month = scanner.nextInt();

    printCalendar(year, month);

  }

  private static void printCalendar(int year, int month) {



  }

}
