package java_adv3.optional;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

// Optional을 반환하는 경우
public class OptionalStartMain2 {

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
    Optional<String> optName = findNameById(id);
    String name = optName.orElse("UNKNOWN");// 값이 없을 때 대체할 값 지정
    System.out.println(id + ": " + name.toUpperCase());
  }

  static Optional<String> findNameById(Long id) {
    String findName = map.get(id);
    Optional<String> optName = Optional.ofNullable(findName);
    return optName;
  }

}