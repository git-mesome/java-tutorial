package java_adv3.lambda.lambda6;

public class CaptureMain {

  public static void main(String[] args) {
    final int final1 = 10; // 명시적 final
    int final2 = 20; // 사실상 final
    int changedVar = 30;

    Runnable anonymous = new Runnable() {
      @Override
      public void run() {
        System.out.println("익명 클래스 - final1: " + final1);
        System.out.println("익명 클래스 - final2: " + final2);
//        System.out.println("익명 클래스 - changedVar: " + changedVar); // 컴파일 에러
      }
    };

    Runnable lambda = () -> {
      System.out.println("람다식 - final1: " + final1);
      System.out.println("람다식 - final2: " + final2);
//      System.out.println("람다식 - changedVar: " + changedVar); // 컴파일 에러
    };

    changedVar++;

    anonymous.run();
    lambda.run();

  }
}
