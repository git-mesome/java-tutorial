package com.example.java_tutorial.collection.compare;

import java.util.TreeSet;

public class SortMain5 {
  public static void main(String[] args) {
    final MyUser myUser1 = new MyUser("a", 30);
    final MyUser myUser2 = new MyUser("b", 20);
    final MyUser myUser3 = new MyUser("c", 10);

    final TreeSet<MyUser> treeSet1 = new TreeSet<>();
    treeSet1.add(myUser1);
    treeSet1.add(myUser2);
    treeSet1.add(myUser3);
    System.out.println("Comparable 기본 정렬");
    System.out.println(treeSet1);

    // tree(set, map)은 만들때부터 정렬해야된다.
    final TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator().reversed());
    treeSet2.add(myUser1);
    treeSet2.add(myUser2);
    treeSet2.add(myUser3);
    System.out.println("IdComparator 정렬");
    System.out.println(treeSet2);
  }
}
