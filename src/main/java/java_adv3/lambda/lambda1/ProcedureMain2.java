package java_adv3.lambda.lambda1;

import java_adv3.lambda.Procedure;

public class ProcedureMain2 {

  public static void main(String[] args) {
    Procedure procedure = () -> {
      System.out.println("hello! lambda");
    };

    procedure.run();
  }

}
