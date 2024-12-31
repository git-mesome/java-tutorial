package com.example.java_tutorial.nested.local;

public class LocalOuterV3 {
  private int outInstanceVar = 3;

  public Printer process(int paramVar) {
    int localVar = 1; //지연 변수는 스택 영역의 스택 프레임이 제거되면서 모두 제거됨

    class LocalPrinter implements Printer {
      int value = 0;
      // 사실 인스턴스 생성 시점에 지연 변수 캡쳐함
      //      int localVar = 1;
      @Override
      public void print() {
        System.out.println("value=" + value);

        // 인스턴스는 지역 변수 보다 더 오래 살아 남는다.

        System.out.println("localVar=" + localVar);
        System.out.println("paramVar=" + paramVar);
        System.out.println("outInstanceVar=" + outInstanceVar);
      }
    }

    Printer print = new LocalPrinter();
    // print.print();를 여기서 실행하지 않고 인스턴스만 반환할거임
    return print;
  }

  public static void main(String[] args) {
    LocalOuterV3 localOuterV1 = new LocalOuterV3();
    Printer printer = localOuterV1.process(2);
    //process()의 스택 프레임이 사라진 이후에 실행
    printer.print();
  }

}
