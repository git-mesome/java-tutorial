package com.example.java_tutorial.stream.test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestMainV4 {

  public static void main(String[] args) {
    List<Member> list = List.of(
        new Member("홍길동", "개발자"),
        new Member("신용권", "디자이너"),
        new Member("김자바", "개발자")
    );

    Map<String, List<Member>> groupingMap = list.stream()
        .collect(
            Collectors.groupingBy(Member::getJob)
        );

    groupingMap.forEach((key, value) -> {
      System.out.println("[" + key + "]");
      value.forEach(member ->
          System.out.println("{name:" + member.getName() + ", job:" + member.getJob() + "}")
      );
      System.out.println();
    });

    System.out.println("[개발자]");
    groupingMap.get("개발자").forEach(member -> {
      System.out.println("{name:" + member.getName() + ", job:" + member.getJob() + "}");
    });

    System.out.println();

    System.out.println("[디자이너]");
    groupingMap.get("디자이너").forEach(member -> {
      System.out.println("{name:" + member.getName() + ", job:" + member.getJob() + "}");
    });

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

    @Override
    public String toString() {
      return "Member{" +
          "name='" + name + '\'' +
          ", job='" + job + '\'' +
          '}';
    }
  }

}
