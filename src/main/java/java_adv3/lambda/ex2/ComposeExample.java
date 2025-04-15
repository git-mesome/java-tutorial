package java_adv3.lambda.ex2;

public class ComposeExample {

  public static MyTransformer compose(MyTransformer f1, MyTransformer f2) {
    return s -> f2.transform(f1.transform(s));
  }

  public static void main(String[] args) {
    MyTransformer toUpper = String::toUpperCase;
    MyTransformer addDeco = s -> "***" + s + "***";
    String hello = compose(toUpper, addDeco).transform("Hello");
    System.out.println(hello);
  }

}
