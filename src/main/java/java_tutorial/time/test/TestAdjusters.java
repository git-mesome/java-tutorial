package java_tutorial.time.test;

import org.springframework.boot.autoconfigure.jms.JmsProperties;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
  /** 입력 받은 월의 첫날 요일과 마지막날 요일을 구해라. */
  public static void main(String[] args) {
    int year = 2024;
    int month = 1;

    LocalDate date = LocalDate.of(year, month, 1);
    DayOfWeek dayOfWeek = date.getDayOfWeek();
    System.out.println("dayOfWeek = " + dayOfWeek);

    DayOfWeek lastDayOfWeek = date.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
    System.out.println("lastDayOfWeek = " + lastDayOfWeek);
  }
}
