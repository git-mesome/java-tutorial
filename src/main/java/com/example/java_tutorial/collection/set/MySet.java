package com.example.java_tutorial.collection.set;

import java.util.Set;

public interface MySet<E> {
  boolean add(E element);

  boolean remove(E value);

  boolean contains(E value);
}
