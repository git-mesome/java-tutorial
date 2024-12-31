package com.example.java_tutorial.collection.list;

public class BatchProcessorMain {
  public static void main(String[] args) {
    MyArrayList<Integer> list = new MyArrayList<>();
    MyLinkedList<Integer> list1 = new MyLinkedList<>();

    BatchProcessor processor = new BatchProcessor(list1);
    processor.logic(50_000);
  }
}
