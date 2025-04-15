package java_adv3.lambda.ex2;

public class BuildGreeterExample {

  public static StringFunction buildGreeter(String greeting) {
    return name -> greeting + ", " + name;
  }

  public static void main(String[] args) {
    System.out.println(buildGreeter("Hello").apply("java"));
    System.out.println(buildGreeter("안녕하세요").apply("자바"));
  }

}
