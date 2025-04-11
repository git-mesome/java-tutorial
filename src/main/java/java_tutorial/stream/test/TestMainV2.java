package java_tutorial.stream.test;

import java.util.List;

public class TestMainV2 {

  public static void main(String[] args) {
    List<Member> list = List.of(
        new Member("홍길동", 30),
        new Member("신용권", 40),
        new Member("김자바", 20)
    );

    list.stream()
        .mapToInt(Member::getAge)
        .average()
        .ifPresent(s -> System.out.println("평균나이 = " + s));

  }

  static class Member {

    private String name;
    private int age;

    public Member(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public String getName() {
      return name;
    }

    public int getAge() {
      return age;
    }
  }
}
