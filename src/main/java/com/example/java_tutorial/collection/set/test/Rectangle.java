package com.example.java_tutorial.collection.set.test;

import java.util.Objects;

public class Rectangle {

  private int width;
  private int height;

  public Rectangle(final int width, final int height) {
    this.width = width;
    this.height = height;
  }

  @Override
  public boolean equals(final Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    final Rectangle rectangle = (Rectangle) o;
    return width == rectangle.width && height == rectangle.height;
  }

  @Override
  public int hashCode() {
    return Objects.hash(width, height);
  }

  @Override
  public String toString() {
    return "Rectangle{" + "width=" + width + ", height=" + height + '}';
  }
}
