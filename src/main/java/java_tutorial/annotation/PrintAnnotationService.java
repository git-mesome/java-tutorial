package java_tutorial.annotation;

public class PrintAnnotationService {

  @PrintAnnotation
  public void method1() {
    System.out.println("method1");
  }

  @PrintAnnotation()
  public void method2() {
    System.out.println("method2");
  }

  @PrintAnnotation(test = "#", number = 20)
  public void method3() {
    System.out.println("method3");
  }

}
