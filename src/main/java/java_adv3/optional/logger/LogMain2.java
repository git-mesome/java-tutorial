package java_adv3.optional.logger;

public class LogMain2 {

  public static void main(String[] args) {
    Logger logger = new Logger();
    logger.setDebug(true);
    logger.debug(value100() + value200());

    System.out.println("=== 디버그 모드 끄기 ===");
    logger.setDebug(false);
    logger.debug(value100() + value200()); // 이 메시지는 출력되지 않음

    System.out.println("=== 디버그 모드 체크 ===");
    if (logger.isDebug()) {
      logger.debug(value100() + value200());
    }
  }

  private static int value100() {
    System.out.println("value100() 메소드 호출");
    return 100;
  }

  private static int value200() {
    System.out.println("value200() 메소드 호출");
    return 20;
  }
}
