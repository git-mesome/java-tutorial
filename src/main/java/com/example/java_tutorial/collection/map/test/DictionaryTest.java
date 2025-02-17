package com.example.java_tutorial.collection.map.test;

import java.util.HashMap;
import java.util.Scanner;

public class DictionaryTest {

  public static void main(String[] args) {

    HashMap<String, String> dictionary = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    System.out.println("==단어 입력 단계==");
    while (true) {
      System.out.println("영어 단어를 입력하세요 (종료는 'q)");
      String englishWord = sc.nextLine();

      if (englishWord.equals("q")) {
        break;
      }

      System.out.println("한글 뜻을 입력하세요:");
      String koreaMeaning = sc.nextLine();

      dictionary.put(englishWord, koreaMeaning);
    }

    System.out.println("==단어 검색 단계==");
    while (true) {
      System.out.println("찾을 영어 단어를 입력하세요 (종료는 'q)");
      String searchWord = sc.nextLine();

      if (searchWord.equals("q")) {
        break;
      }

      if (!dictionary.containsKey(searchWord)) {
        System.out.println(searchWord + "은(는) 사전에 없는 단어입니다.");
      } else {
        System.out.println(searchWord + "의 뜻:" + dictionary.get(searchWord));
      }
    }
  }
}
