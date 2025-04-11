package java_tutorial.collection.deque.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class TaskScheduler {

  private Deque<Task> tasks = new ArrayDeque<>();

  public void addTask(Task task) {
    tasks.offer(task);
  }

  public int getRemainingTasks() {
    return tasks.size();
  }

  public void processNextTask() {
    if (!tasks.isEmpty()) {
      tasks.poll().execute();
    }
  }
}
