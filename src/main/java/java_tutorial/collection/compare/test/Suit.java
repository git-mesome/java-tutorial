package java_tutorial.collection.compare.test;

public enum Suit {
  SPADE("♠"), // 스페이드(♠)
  HEART("♥"), // 하트(♥)
  DIAMOND("♦"), // 다이아몬드(♦)
  CLUB("♣"); // 클로버(♣)

  private final String icon;

  Suit(final String icon) {
    this.icon = icon;
  }

  public String getIcon() {
    return icon;
  }
}
