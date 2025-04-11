package java_tutorial.rambda;

public class LambdaMainV1 {

  public static void main(String[] args) {
    action(new Calculable() {
      @Override
      public void calculate(int x, int y) {
        int result = x + y;
        System.out.println("result without rambda = " + result);
      }
    });

    action((x, y) -> {
      int result = x + y;
      System.out.println("result rambda = " + result);
    });
  }

  private static void action(Calculable calculable) {
    int x = 10;
    int y = 5;
    calculable.calculate(x, y);
  }
}
