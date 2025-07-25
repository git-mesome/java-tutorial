package java_adv3.defaultmethod.ex2;

public class AppPushNotifier implements Notifier {

  @Override
  public void notify(String message) {
    System.out.println("[APP] " + message);
  }

}
