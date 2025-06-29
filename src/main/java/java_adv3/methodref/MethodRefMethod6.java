package java_adv3.methodref;

import java.util.function.BiFunction;
import java_adv3.methodref.person.Person;

public class MethodRefMethod6 {

  public static void main(String[] args) {
    Person person = new Person("Kim");

    BiFunction<Person, Integer, String> fun1 =
        (Person p, Integer number) -> p.introduceWithNumber(number);
    System.out.println("person.introduceWithNumber = " + fun1.apply(person, 1));

    BiFunction<Person, Integer, String> fun2 =
        Person::introduceWithNumber;
    System.out.println("person.introduceWithNumber = " + fun2.apply(person, 1));
  }

}
