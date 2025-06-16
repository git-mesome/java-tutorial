package java_adv3.methodref;

import java.util.function.Function;
import java_adv3.methodref.person.Person;

public class MethodRefMethod3 {

  public static void main(String[] args) {

    Person person1 = new Person("Kim");
    Person person2 = new Person("Lee");
    Person person3 = new Person("Park");

    Function<Person, String> fun1 = (Person p) -> p.introduce();
    System.out.println("fun1 = " + fun1.apply(person1));
    System.out.println("fun2 = " + fun1.apply(person2));
    System.out.println("fun3 = " + fun1.apply(person3));

    Function<Person, String> fun2 = Person::introduce;
    System.out.println("fun2 = " + fun2.apply(person1));
    System.out.println("fun2 = " + fun2.apply(person2));
    System.out.println("fun2 = " + fun2.apply(person3));
  }

}
