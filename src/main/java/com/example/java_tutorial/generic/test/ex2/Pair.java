package com.example.java_tutorial.generic.test.ex2;

public class Pair<T1, T2> {

  private T1 first;
  private T2 second;

  public T1 getFirst() {
    return first;
  }

  public T2 getSecond() {
    return second;
  }

  public void setFirst(T1 first) {
    this.first = first;
  }

  public void setSecond(T2 second) {
    this.second = second;
  }

  @Override
  public String toString() {
    return "Pair{first="+first+" ,second="+second+"}";
  }
}
