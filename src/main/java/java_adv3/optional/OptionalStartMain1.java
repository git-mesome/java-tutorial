package java_adv3.optional;

import java.util.HashMap;
import java.util.Map;

// null을 직접 반환하는 경우
public class OptionalStartMain1 {

  private static final Map<Long, String> map = new HashMap<>();

  static {
    map.put(1L, "Kim");
    map.put(2L, "Lee");
    // 3L은 의도적으로 생략
  }

  public static void main(String[] args) {
    findAndPrint(1L);
    findAndPrint(3L);  // 값이 없는 경우
  }

  static void findAndPrint(Long id) {
    String name = findNameById(id);
    // 1. NullPointerException 유발
//    System.out.println("name = " + name.toUpperCase());

    // 2. if 문을 활용한 null 필요
    if (name != null) {
      System.out.println(id + ": " + name.toUpperCase());
    } else {
      System.out.println(id + ": " + "UNKNOWN");
    }
  }

  static String findNameById(Long id) {
    return map.get(id);
  }

}
