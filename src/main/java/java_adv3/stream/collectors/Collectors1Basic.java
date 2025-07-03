package java_adv3.stream.collectors;

import static java.util.stream.Collectors.toCollection;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;
import static java.util.stream.Collectors.toUnmodifiableList;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Collectors1Basic {

  public static void main(String[] args) {
    // 기본 기능
    List<String> list = Stream.of("Java", "Spring", "JPA")
        .collect(toList());
    System.out.println("list = " + list);

    // 수정 불가능 리스트
    List<Integer> unmodifiableList = Stream.of(1, 2, 3)
        .collect(toUnmodifiableList());
//    unmodifiableList.add(4); // 런타임 예외
    System.out.println("unmodifiableList = " + unmodifiableList);

    Set<Integer> set = Stream.of(1, 2, 2, 3, 3, 3)
        .collect(toSet());
    System.out.println("set = " + set);

    // 타입 지정
    TreeSet<Integer> treeSet = Stream.of(3, 4, 5, 2, 1)
        .collect(toCollection(TreeSet::new));
    System.out.println("treeSet = " + treeSet);
  }

}
