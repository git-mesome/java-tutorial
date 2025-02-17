package com.example.java_tutorial.collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {
  public static void main(String[] args) {
    final Deque<Integer> deque = new ArrayDeque<>();

    // 데이터 추가
    deque.offerFirst(1);
    deque.offerFirst(2);
    System.out.println(deque);
    deque.offerLast(3);
    deque.offerLast(4);
    System.out.println(deque);

    // 다음 꺼낼 데이터 확인
    System.out.println("deque.peekFirst() = " + deque.peekFirst());
    System.out.println("deque.peekLast() = " + deque.peekLast());

    System.out.println("deque.pollFirst() = " + deque.pollFirst());
    System.out.println("deque.pollFirst() = " + deque.pollFirst());
    System.out.println("deque.pollLast() = " + deque.pollLast());
    System.out.println("deque.pollLast() = " + deque.pollLast());
    System.out.println(deque);
  }
}
