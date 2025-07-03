package java_adv3.stream.collectors;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class DownStreamMain2 {

  public static void main(String[] args) {
    List<Student> students = List.of(
        new Student("Kim", 1, 85),
        new Student("Lee", 1, 90),
        new Student("Park", 2, 95),
        new Student("Han", 3, 80),
        new Student("Jung", 2, 70),
        new Student("Cho", 2, 60),
        new Student("Kang", 3, 75)
    );

    // 1단계 : 학년별로 학생들을 그룹화 해라.
    Map<Integer, List<Student>> collect1 = students.stream()
        .collect(Collectors.groupingBy(Student::getGrade));
    System.out.println("collect1 = " + collect1);

    // 2단계 : 학년별로 가장 점수가 높은 학생을 구해라(reducing 사용)
    Map<Integer, Optional<Student>> collect2 = students.stream()
        .collect(Collectors.groupingBy(
            Student::getGrade,
            Collectors.reducing((i1, i2) -> i1.getScore() > i2.getScore() ? i1 : i2)
        ));
    System.out.println("collect2 = " + collect2);

    // 3단계 : 학년별로 가장 점수가 높은 학생을 구해라(maxBy 사용)
    Map<Integer, Optional<Student>> collect3 = students.stream()
        .collect(Collectors.groupingBy(
                Student::getGrade,
//            Collectors.maxBy((i1, i2) -> Integer.compare(i1.getScore(), i2.getScore())
//                Collectors.maxBy(Comparator.comparingInt(student -> student.getScore()))
                Collectors.maxBy(Comparator.comparingInt(Student::getScore))
            )
        );
    System.out.println("collect3 = " + collect3);

    // 4단계 : 학년별로 가장 점수가 높은 학생의 이름을 구해라(collectingAndThen + maxBy 사용)
    // 학년별 그룹 -> 그룹별 가장 점수가 높은 학생 -> 그룹별 학생 -> 그룹별 이름
    Map<Integer, String> collect4 = students.stream()
        .collect(Collectors.groupingBy(
                Student::getGrade,
                Collectors.collectingAndThen(
                    Collectors.maxBy(
                        Comparator.comparingInt(Student::getScore)
                    ),
                    sOpt -> sOpt.get().getName()
                )
            )
        );
    System.out.println("collect4 = " + collect4);
  }

}
