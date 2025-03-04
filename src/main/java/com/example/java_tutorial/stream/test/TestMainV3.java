package com.example.java_tutorial.stream.test;

import java.util.List;

public class TestMainV3 {

  public static void main(String[] args) {
    List<Member> list = List.of(
        new Member("홍길동", "개발자"),
        new Member("신용권", "디자이너"),
        new Member("김자바", "개발자")
    );

    list.stream()
        .filter(member -> member.getJob().equals("개발자"))
        .map(Member::getName)
        .forEach(System.out::println);

  }

  static class Member {

    private String name;
    private String job;

    public Member(String name, String job) {
      this.name = name;
      this.job = job;
    }

    public String getName() {
      return name;
    }

    public String getJob() {
      return job;
    }
  }

}
