package java_adv2.annotation.java;


import java.util.ArrayList;
import java.util.List;

public class SuppressWarningCase {

  public void unusedWarning() {
    // 사용되지 않는 변수 경고 억제
    @SuppressWarnings("unused")
    int unusedVariable = 10;
  }

  @SuppressWarnings("deprecation")
  public void deprecatedMethod() {
    // 사용되지 않는 메서드 경고 억제
    java.util.Date date = new java.util.Date();
    int date1 = date.getDate();
  }

  @SuppressWarnings({"rawtypes", "unchecked"})
  public void uncheckedCast() {
    // 제네립 타입 캐스팅 경고 억제, raw type 사용 경고
    List list = new ArrayList();

    // unchecked cast 경고 억제
    List<String> stringList = (List<String>) list;
  }

  @SuppressWarnings("all")
  public void suppressAllWarning() {
    java.util.Date date = new java.util.Date();
    date.getDate();

    List list = new ArrayList();

    // unchecked cast 경고 억제
    List<String> stringList = (List<String>) list;
  }
}
