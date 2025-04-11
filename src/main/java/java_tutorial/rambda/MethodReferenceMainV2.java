package java_tutorial.rambda;

public class MethodReferenceMainV2 {

  public static void main(String[] args) {
    PersonV4 person = new PersonV4();

    // (a, b) -> a.compareToIgnoreCase(b);
    person.ordering(String::compareToIgnoreCase);

  }

}
