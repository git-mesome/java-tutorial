package java_tutorial.generic.ex5;

import java_tutorial.generic.animal.Animal;
import java_tutorial.generic.animal.Cat;
import java_tutorial.generic.animal.Dog;

public class WildcardMain2 {
  public static void main(String[] args) {
    Box<Object> objectBox = new Box<>();
    Box<Animal> animalBox = new Box<>();
    Box<Dog> dogBox = new Box<>();
    Box<Cat> catBox = new Box<>();

    // Animal 포함 상위 타입 전달 가능
    writeBox(objectBox);
    writeBox(animalBox);
    //    wrtieBox(dogBox); 컴파일에러 / 하한이 Animal

    Animal animal = animalBox.get();
    System.out.println("animal = " + animal);
  }

  static void writeBox(Box<? super Animal> box) {
    box.set(new Dog("멍멍이", 100));
  }
}
