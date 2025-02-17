package com.example.java_tutorial.static2.ex;

public class Car {

  private int totalCars = 0;
  private String name;

  public Car(String name) {
    System.out.println("차량 구입" + name);
    this.name = name;
    totalCars++;
  }

  public void showTotalCars() {
    System.out.println("구매 차량 수 " + totalCars);
  }
}
