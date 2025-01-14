package com.example.java_tutorial.collection.set;

import com.example.java_tutorial.collection.set.member.Member;

public class JavaHashCodeMain {

  public static void main(String[] args) {
    Object object1 = new Object();
    Object object2 = new Object();
    System.out.println("object1.hashCode() = " + object1.hashCode());
    System.out.println("object2.hashCode() = " + object2.hashCode());

    // 각 클래스마다 hashCode를 이미 오버라이딩 해두었다.
    Integer i = 10;
    String strA = "A";
    String strAB = "AB";

    System.out.println("10.hashCode() = " + i.hashCode());
    System.out.println("A.hashCode() = " + strA.hashCode());
    System.out.println("AB.hashCode() = " + strAB.hashCode());

    //마이너그 값 가능
    System.out.println("-1.hashCode = " + Integer.valueOf(-1).hashCode());

    //둘은 같을까?
    Member member1 = new Member("idA");
    Member member2 = new Member("idA");

    //equals, hashCode를 오버라이딩 안한 경우와 한 경우를 비교
    System.out.println("(member1==member2) = " + (member1 == member2));
    System.out.println("member1.equals(member2) = " + (member1.equals(member2)));
    System.out.println("member1.hashCode() = " + member1.hashCode());
    System.out.println("member2.hashCode() = " + member2.hashCode());
  }
}
