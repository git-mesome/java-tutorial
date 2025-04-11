package java_adv1.thread.bounded;

public interface BoundedQueue {

  void put(String data);

  String take();

}
