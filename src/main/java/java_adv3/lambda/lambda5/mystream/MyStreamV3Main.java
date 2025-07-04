package java_adv3.lambda.lambda5.mystream;

import java.util.List;

public class MyStreamV3Main {

  public static void main(String[] args) {
    List<Student> students = List.of(
        new Student("Apple", 100),
        new Student("Banana", 80),
        new Student("Cherry", 50),
        new Student("Tomato", 40)
    );

    // 점수 80점 이상
    List<String> result1 = ex1(students);
    System.out.println("result1 = " + result1);

    // 점수 80점 이상이면서, 이름이 5글자인 학생 이름 대문자로
    List<String> result2 = ex2(students);
    System.out.println("result2 = " + result2);

  }

  static List<String> ex1(List<Student> students) {
    return MyStreamV3.of(students)
        .filter(s -> s.getScore() >= 80)
        .map(Student::getName)
        .toList();
  }

  static List<String> ex2(List<Student> students) {
    return MyStreamV3.of(students)
        .filter(s -> s.getScore() >= 80)
        .filter(s -> s.getName().length() == 5)
        .map(s -> s.getName().toUpperCase())
        .toList();
  }


}
