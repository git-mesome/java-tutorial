package java_tutorial.collection.utils;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OfMain {

  public static void main(String[] args) {
    // 편리한 불변 컬렉션 생성 (변경 불가능, 값 읽기만 가능)
    final List<Integer> list = List.of(1, 2, 3);
    final Set<Integer> set = Set.of(1, 2, 3);
    final Map<Integer, String> map = Map.of(1, "one", 2, "two", 3, "three");

    // java.lang.UnsupportedOperationException
    //     list.add(1);

    System.out.println("list = " + list);
    System.out.println("set = " + set);
    System.out.println("map = " + map);
    System.out.println("list class=" + list.getClass()); // immutableCollections 의 리스트가 나옴
    System.out.println("set class=" + set.getClass());
    System.out.println("map class=" + map.getClass());
  }
}
