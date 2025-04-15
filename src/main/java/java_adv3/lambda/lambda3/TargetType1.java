package java_adv3.lambda.lambda3;

public class TargetType1 {

  public static void main(String[] args) {
    // 람다 직접 대입: 문제 없음
    FunctionA functionA = i -> "value i =" + i;
    FunctionB functionB = i -> "value i =" + i;

    // 이미 만들어진 FunctionA 인스턴스를 FunctionB에 대입: 불가능(타입 불일치)
    //  FunctionB targetB = functionA; // 컴파일 에러

  }

  @FunctionalInterface
  interface FunctionA {

    String apply(Integer integer);

  }

  @FunctionalInterface
  interface FunctionB {

    String apply(Integer integer);

  }
}
