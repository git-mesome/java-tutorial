package java_tutorial.poly.ex.sendar;

public class InstagramSender implements Sender {
  @Override
  public void sendMessage(String message) {
    System.out.println("인스타그램을 발송합니다." + message);
  }
}
