package java_tutorial.rambda;

public class PersonV3 {

  public void action(CalculableV2 calculable) {
    double result = calculable.calculate(10, 4);
    System.out.println("result = " + result);
  }

}
