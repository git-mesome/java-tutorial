package com.example.java_tutorial.rambda;

public class Button {

  @FunctionalInterface
  public interface ClickListener {

    void onClick();
  }

  private ClickListener clickListener;

  public void setClickListener(ClickListener clickListener) {
    this.clickListener = clickListener;
  }

  public void click() {
    this.clickListener.onClick();
  }

}
