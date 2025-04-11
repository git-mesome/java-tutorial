package java_tutorial.generic.test.ex3;

import java_tutorial.generic.test.ex3.unit.BioUnit;

public class UnitPrinter {

  public static <T extends Shuttle<?>> void printV1(T t) {
    t.showInfo();
  }

  //  public static <T extends Shuttle<BioUnit>> void printV1(T t) {
  //    t.showInfo();
  //  }

  public static <T extends BioUnit> void printV3(Shuttle<T> t) {
    t.showInfo();
  }

  public static void printV2(Shuttle<?> t) {
    t.showInfo();
  }

  public static void printV4(Shuttle<? extends BioUnit> t) {
    t.showInfo();
  }
}
