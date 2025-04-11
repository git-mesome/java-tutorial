package java_tutorial.generic.ex1;

public class BoxMain3 {

  public static void main(String[] args) {
    GenericBox<Integer> integerBox = new GenericBox<Integer>(); // 생성 시점에 T 타입 결정

    integerBox.set(10);
    //    integerBox.set("문자열 반환 실패");
    Integer integer = integerBox.get();
    System.out.println("integer = " + integer);

    GenericBox<String> stringBox = new GenericBox<>();
    stringBox.set("Hello");
    String string = stringBox.get();
    System.out.println("string = " + string);

    // 원하는 모든 타입 사용 가능
    GenericBox<Double> doubleBox = new GenericBox<>();
    doubleBox.set(3.14);
    Double doubleValue = doubleBox.get();
    System.out.println("doubleValue = " + doubleValue);
  }
}
