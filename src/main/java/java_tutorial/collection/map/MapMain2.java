package java_tutorial.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {
  public static void main(String[] args) {
    final Map<String, Integer> studentMap = new HashMap<>();

    studentMap.put("studentA", 90);
    //    System.out.println(studentMap);

    studentMap.put("studentA", 100); // 같은 키에 저장시 기존 값 교체
    System.out.println(studentMap);

    final boolean containsKey = studentMap.containsKey("studentA");
    System.out.println("containsKey = " + containsKey);

    studentMap.remove("studentA");
    System.out.println(studentMap);
  }
}
