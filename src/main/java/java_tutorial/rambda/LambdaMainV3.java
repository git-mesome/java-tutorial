package java_tutorial.rambda;

public class LambdaMainV3 {

  public static void main(String[] args) {
    PersonV2 person = new PersonV2();

    person.action1(((name, job) -> {
      System.out.print(name + "이 ");
      System.out.println(job + "를 합니다.");
    }));

    person.action2((word) ->
        System.out.println(word + "라고 말합니다.")
    );
  }

}
