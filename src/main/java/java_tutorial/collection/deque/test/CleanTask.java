package java_tutorial.collection.deque.test;

public class CleanTask implements Task {

  @Override
  public void execute() {
    System.out.println("사용하지 않은 자원 정리...");
  }
}
