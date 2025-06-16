package java_adv3.methodref;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java_adv3.lambda.lambda5.mystream.MyStreamV3;
import java_adv3.methodref.person.Person;

public class MethodRefMethod5 {

  public static void main(String[] args) {

    List<Person> personList = List.of(
        new Person("Kim")
        , new Person("Lee")
        , new Person("Park")
    );

    List<String> result1 = MyStreamV3.of(personList)
        .map(person -> person.introduce())
        .map(string -> string.toUpperCase())
        .toList();
    System.out.println("result1 = " + result1);

    List<String> result2 = MyStreamV3.of(personList)
        .map(Person::introduce)
        .map(String::toUpperCase)
        .toList();
    System.out.println("result2 = " + result2);

  }

  static List<String> mapPersonToString(List<Person> personList, Function<Person, String> fun) {
    List<String> result = new ArrayList<>();
    for (Person p : personList) {
      String applied = fun.apply(p);
      result.add(applied);
    }
    return result;
  }

  static List<String> mapStringToString(List<String> strings, Function<String, String> fun) {
    List<String> result = new ArrayList<>();
    for (String p : strings) {
      String applied = fun.apply(p);
      result.add(applied);
    }
    return result;
  }


}
