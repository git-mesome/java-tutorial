package com.example.java_tutorial.regex;

import java.util.regex.Pattern;

public class PatternExample {

  public static void main(String[] args) {
    String regExp = "(02|010)-\\d{3,4}-\\d{4}";
    String data = "010-132-4567";
    boolean result = Pattern.matches(regExp, data);

    if (result) {
      System.out.println("정규식 일치");
    } else {
      System.out.println("정규식 불일치");
    }

    regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
    data = "minseo@kakao.com";
    result = Pattern.matches(regExp, data);

    if (result) {
      System.out.println("정규식 일치");
    } else {
      System.out.println("정규식 불일치");
    }

    /**
     * \d 숫자
     * \s 공백
     * \w 알파벳
     * \. .
     * . 모든 문자 중 한 문자
     * ? 없음 또는 한 개
     * * 없음 또는 한 개 이상
     * + 한개 이상
     * {n} n개
     * {n,} 최소 n개
     * {n,m} n부터 m개 까지
     * a | b
     * () 그룹핑
     * ^ not
     */

  }

}
