package com.example.java_adv2.reflection;

import com.example.java_adv2.reflection.data.BasicData;
import java.lang.reflect.Method;

public class MethodV1 {

  public static void main(String[] args) {
    Class<BasicData> helloClass = BasicData.class;

    System.out.println("===== methods =====");
    Method[] methods = helloClass.getMethods();
    for (Method method : methods) {
      System.out.println("method = " + method);
    }

    System.out.println("===== declared methods =====");
    Method[] declaredMethods = helloClass.getDeclaredMethods();
    for (Method method : declaredMethods) {
      System.out.println("method = " + method);
    }
  }

}
