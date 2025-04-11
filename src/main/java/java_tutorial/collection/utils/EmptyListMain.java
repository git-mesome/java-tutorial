package java_tutorial.collection.utils;

import java.util.*;

public class EmptyListMain {

  public static void main(String[] args) {
    // 빈 가변 리스트 생성
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new LinkedList<>();

    // 빈 불변 리스트 생성
    final List<Integer> list3 = Collections.emptyList(); // java 5
    final List<Integer> list4 = List.of(); // java 9

    System.out.println("list3 = " + list3.getClass());
    System.out.println("list4 = " + list4.getClass());

    final List<Integer> list5 = Arrays.asList(1, 2, 3, 4, 5);
    final List<Integer> list6 = List.of(1, 2, 3, 4, 5);

    // Arrays.asList 가 더 나은 경우
    Integer[] arr = {1, 2, 3, 4, 5};
    // 배열의 참조값을 그대로 가져다 씀(arr의 값이 같이 바뀜) -> 큰 자료구조에 유리 ex.엄청 큰 배열
    final List<Integer> arrList = Arrays.asList(arr);
    arrList.set(0, 100);

    System.out.println("arr = " + Arrays.toString(arr));
    System.out.println("arrList = " + arrList);

    // 하나씩 돌려가면서 새로운 리스트를 만듦
    final List<Integer> arr1 = List.of(arr);
  }
}
