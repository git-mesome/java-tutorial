package com.example.java_tutorial.collection.deque.test;

public class SchedulerTest {

  public static void main(String[] args) {
    // 낮에 작업 저장
    TaskScheduler scheduler = new TaskScheduler();
    scheduler.addTask(new CompressionTask());
    scheduler.addTask(new BackupTask());
    scheduler.addTask(new CleanTask());

    System.out.println("작업 시작");
    run(scheduler);
    System.out.println("작업 완료");
  }

  private static void run(TaskScheduler scheduler) {
    while (scheduler.getRemainingTasks() > 0) {
      scheduler.processNextTask();
    }
  }
}
