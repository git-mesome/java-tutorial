package java_tutorial.time.test;

import java.time.LocalDate;

public class TestLoopPlus {
  /***
   * 2024년 1월 1일부터 2주간격으로 5번 반복하여 날짜를 출력하는 코드
   */
  public static void main(String[] args) {
    LocalDate startDate = LocalDate.of(2020, 1, 1);
    for (int i = 0; i < 5; i++) {
      LocalDate nestDate = startDate.plusWeeks(2 * i);
      System.out.println("날짜 " + (i + 1) + " :" + nestDate);
    }
  }
}
