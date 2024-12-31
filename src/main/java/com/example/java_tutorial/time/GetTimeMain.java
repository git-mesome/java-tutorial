package com.example.java_tutorial.time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {

  public static void main(String[] args) {
    LocalDateTime dt = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
    System.out.println("Year: " + dt.get(ChronoField.YEAR));
    System.out.println("Year: " + dt.getYear());
    System.out.println("Month: " + dt.get(ChronoField.MONTH_OF_YEAR));
    System.out.println("Day of Month: " + dt.get(ChronoField.DAY_OF_MONTH));
    System.out.println("Hour of Day: " + dt.get(ChronoField.HOUR_OF_DAY));
    System.out.println("Minute of Hour: " + dt.get(ChronoField.MINUTE_OF_HOUR));
    System.out.println("Second of Minute: " + dt.get(ChronoField.SECOND_OF_MINUTE));

    System.out.println("편의 메서드 제공");
    System.out.println("Year: " + dt.getYear());
    System.out.println("Month: " + dt.getMonth());
    System.out.println("Month: " + dt.getMonthValue());
    System.out.println("Day of Month: " + dt.getDayOfMonth());
    System.out.println("Hour of Day: " + dt.getHour());
    System.out.println("Minute of Hour: " + dt.getMinute());
    System.out.println("Second of Minute: " + dt.getSecond());

    System.out.println("편의 메서드 없음");
    System.out.println("MINUTE of Day: " + dt.get(ChronoField.MINUTE_OF_DAY));
    System.out.println("SECOND_OF_DAY: " + dt.get(ChronoField.SECOND_OF_DAY));
    System.out.println("SECOND_OF_MINUTE: " + dt.get(ChronoField.SECOND_OF_MINUTE));

  }
}
