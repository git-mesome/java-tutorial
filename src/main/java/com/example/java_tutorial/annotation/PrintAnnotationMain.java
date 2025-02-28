package com.example.java_tutorial.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationMain {

  public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
    Method[] declaredMethods = PrintAnnotationService.class.getDeclaredMethods();
    for (Method method : declaredMethods) {
      PrintAnnotation annotation = method.getAnnotation(PrintAnnotation.class);

      printLine(annotation);

      method.invoke(new PrintAnnotationService());

      printLine(annotation);
    }


  }

  private static void printLine(PrintAnnotation annotation) {
    if (annotation != null) {
      int number = annotation.number();

      for (int i = 0; i < number; i++) {
        String value = annotation.test();
        System.out.print(value);
      }
      System.out.println();
    }
  }
}
