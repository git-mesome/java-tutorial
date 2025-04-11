package java_adv1.thread.collection.java;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

public class MapMain {

  public static void main(String[] args) {
    // HashMap
    Map<Integer, String> map1 = new ConcurrentHashMap<>();
    map1.put(3, "three");
    map1.put(2, "two");
    map1.put(1, "one");
    System.out.println("map1 = " + map1);

    // TreeMap
    Map<Integer, String> map2 = new ConcurrentSkipListMap<>();
    map2.put(3, "three");
    map2.put(2, "two");
    map2.put(1, "one");
    System.out.println("map2 = " + map2);

  }

}
