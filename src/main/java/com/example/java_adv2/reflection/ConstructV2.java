package com.example.java_adv2.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ConstructV2 {

  public static void main(String[] args)
      throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    Class<?> aClass = Class.forName("com.example.java_adv2.reflection.data.BasicData");

    Constructor<?> constructors = aClass.getDeclaredConstructor(String.class);
    constructors.setAccessible(true);
    Object instance = constructors.newInstance("hello");
    System.out.println("instance = " + instance);

    Method method1 = aClass.getDeclaredMethod("call");
    method1.invoke(instance);

  }

}
