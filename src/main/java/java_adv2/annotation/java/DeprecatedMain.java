package java_adv2.annotation.java;

public class DeprecatedMain {

  public static void main(String[] args) {
    System.out.println("== DeprecatedClass 사용 ==");
    DeprecatedClass dc = new DeprecatedClass();
    dc.call1();
    dc.call2();  // IDE 경고
    dc.call3();  // IDE 경고(심각)
  }

}
