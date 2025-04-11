package java_tutorial.rambda;

public class MethodReferenceMainV1 {

  public static void main(String[] args) {
    PersonV3 person = new PersonV3();

    // 정적 메소드
    person.action(Computer::staticMethod);

    // 인스턴스 메소드
    Computer computer = new Computer();
    person.action(computer::instanceMethod);

  }

}
