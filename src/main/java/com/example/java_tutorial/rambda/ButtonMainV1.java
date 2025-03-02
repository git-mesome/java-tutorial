package com.example.java_tutorial.rambda;

public class ButtonMainV1 {

  public static void main(String[] args) {
    Button buttonOk = new Button();

    buttonOk.setClickListener(
        () -> System.out.println("ok 버튼 클릭")
    );

    buttonOk.click();

    Button buttonCancel = new Button();
    buttonCancel.setClickListener(
        () -> System.out.println("cancel 버튼 클릭")
    );

    buttonCancel.click();
  }

}
