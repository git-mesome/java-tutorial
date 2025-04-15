package java_adv3.lambda.start;

import java.util.Random;
import java_adv3.lambda.Procedure;

public class Ex1RefMain {

  public static void hello(Procedure procedure) {
    long startNs = System.nanoTime();

    //코드 조각 시작
    procedure.run();

    //코드 조각 종료
    long endNs = System.nanoTime();
    System.out.println("실행 시간: " + (endNs - startNs) + "ns");
  }

  static class Dice implements Procedure {

    @Override
    public void run() {
      int randomValue = new Random().nextInt(6) + 1;
      System.out.println("주사위 = " + randomValue);
    }

  }

  static class Sum implements Procedure {

    @Override
    public void run() {
      for (int i = 1; i <= 3; i++) {
        System.out.println("i = " + i);
      }
    }
  }

  public static void main(String[] args) {
    hello(new Dice());
    hello(new Sum());
  }
}