package com.example.java_tutorial.event;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.Random;

public class BurgerOrderingSystem {

  public static CompletableFuture<String> cook() {
    return CompletableFuture.supplyAsync(() -> {
      String threadName = Thread.currentThread().getName();
      System.out.println("[Cook Thread: " + threadName + "] Cooking started...");
      try {
        Thread.sleep(1000); // 1초 동안 요리하는 딜레이
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      String burger = "Burger #" + (new Random().nextInt(10) + 1);
      System.out.println("[Cook Thread: " + threadName + "] " + burger + " is cooked!");
      return burger;
    });
  }

  public static CompletableFuture<String> cashier(String burger) {
    return CompletableFuture.supplyAsync(() -> {
      String threadName = Thread.currentThread().getName();
      System.out.println("[Cashier Thread: " + threadName + "] Cashier started...");
      try {
        Thread.sleep(500); // 0.5초 동안 계산하는 딜레이
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      System.out.println("[Cashier Thread: " + threadName + "] Burger is ready for pick up!");
      System.out.println("[Cashier Thread: " + threadName + "] " + burger + "? That's me! Mmmmmm!");
      return "Order completed!";
    });
  }

  public static void main(String[] args) {
    long startTime = System.currentTimeMillis(); // 시작 시간 기록

    // 주문 시작
    CompletableFuture<String> burgerFuture = cook()
        .thenCompose(burger -> cashier(burger));

    // 모든 작업이 완료된 후 최종 메시지 출력
    burgerFuture.thenAccept(result -> {
      long endTime = System.currentTimeMillis(); // 종료 시간 기록
      System.out.println(result);
      System.out.println("Total time taken: " + (endTime - startTime) + " ms");
    });

    try {
      // 비동기 작업이 모두 끝날 때까지 기다림
      burgerFuture.get();
    } catch (InterruptedException | ExecutionException e) {
      e.printStackTrace();
    }
  }
}
