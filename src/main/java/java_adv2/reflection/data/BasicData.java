package java_adv2.reflection.data;

public class BasicData {

  public String publicField;
  private int privateField;

  public BasicData() {
    System.out.println("BasicData constructor");
  }

  private BasicData(String data) {
    System.out.println("BasicData constructor with data: " + data);
  }

  public void call() {
    System.out.println("BasicData.call");
  }

  public String hello(String str) {
    System.out.println("BasicData.hello");
    return str + " test";
  }

  private void privateMethod() {
    System.out.println("BasicData.privateMethod");
  }

  void defaultMethod() {
    System.out.println("BasicData.defaultMethod");
  }

  protected void protectedMethod() {
    System.out.println("BasicData.protectedMethod");
  }
}
