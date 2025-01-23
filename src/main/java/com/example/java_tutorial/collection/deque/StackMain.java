package com.example.java_tutorial.collection.deque;

import java.util.Stack;

public class StackMain {

  public static void main(String[] args) {
    final Stack<Integer> stack = new Stack();

    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(2);

    System.out.println(stack);

    System.out.println("stack.peek() = " + stack.peek());

    System.out.println("stack.pop() = " + stack.pop());
    System.out.println("stack.pop() = " + stack.pop());
    System.out.println("stack.pop() = " + stack.pop());

    System.out.println(stack);
  }
}
