package com.example.java_adv2.reflection;

import java.lang.reflect.Constructor;

public class ConstructV1 {

  public static void main(String[] args) throws ClassNotFoundException {
    Class<?> aClass = Class.forName("com.example.java_adv2.reflection.data.BasicData");

    System.out.println("===== constructors() =====");
    Constructor<?>[] constructors = aClass.getConstructors();
    for (Constructor<?> constructor : constructors) {
      System.out.println("constructor = " + constructor);
    }

    System.out.println("===== declared constructors() =====");
    Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
    for (Constructor<?> declaredConstructor : declaredConstructors) {
      System.out.println("declaredConstructor = " + declaredConstructor);
    }
  }

}
