package java_adv3.methodref;

import java.util.function.Function;
import java_adv3.methodref.person.Person;

public class MethodRefMethod2 {

  public static void main(String[] args) {
    Function<String, String> staticMethod1 = name -> Person.greetingWithName(name);
    Function<String, String> static2Method2 = Person::greetingWithName;
    System.out.println("staticMethod1 = " + staticMethod1.apply("Kim"));
    System.out.println("staticMethod2 = " + static2Method2.apply("Kim"));

    Person person = new Person("Kim");
    Function<Integer, String> instanceMethod1 = n -> person.introduceWithNumber(n);
    Function<Integer, String> instanceMethod2 = person::introduceWithNumber;
    System.out.println("instanceMethod1 = " + instanceMethod1.apply(1));
    System.out.println("instanceMethod2 = " + instanceMethod2.apply(1));

    Function<String, Person> newPerson1 = name -> new Person(name);
    Function<String, Person> newPerson2 = Person::new;
    System.out.println("newPerson1 = " + newPerson1.apply("Kim"));
    System.out.println("newPerson2 = " + newPerson2.apply("Lee"));


  }

}
