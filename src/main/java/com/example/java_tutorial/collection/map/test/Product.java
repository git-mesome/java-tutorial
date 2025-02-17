package com.example.java_tutorial.collection.map.test;

import java.util.Objects;

public class Product {

  private final String name;
  private final int price;

  public Product(String name, int price) {
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Product product = (Product) o;
    return price == product.price && Objects.equals(name, product.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, price);
  }

  @Override
  public String toString() {
    return "Product{" + "name='" + name + '\'' + ", price=" + price + '}';
  }
}
