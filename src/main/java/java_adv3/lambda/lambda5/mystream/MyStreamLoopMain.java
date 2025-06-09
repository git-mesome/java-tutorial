package java_adv3.lambda.lambda5.mystream;

import java.util.List;

public class MyStreamLoopMain {

  public static void main(String[] args) {
    List<Student> students = List.of(
        new Student("Apple", 100),
        new Student("Banana", 80),
        new Student("Cherry", 50),
        new Student("Tomato", 40)
    );

    List<String> result = MyStreamV3.of(students)
        .filter(s -> s.getScore() >= 80)
        .map(Student::getName)
        .toList();

    for (String s : result) {
      System.out.println("name = " + s);
    }

    MyStreamV3.of(students)
        .filter(s -> s.getScore() >= 80)
        .map(Student::getName)
        .forEach(System.out::println);

  }


}
