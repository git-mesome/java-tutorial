package com.example.java_adv1.thread.control.printer;

import static com.example.java_adv1.util.MyLogger.log;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

public class MyPrinterV3 {

  public static void main(String[] args) {

    final Printer printer = new Printer();
    final Thread printerThread = new Thread(printer, "printer");
    printerThread.start();

    final Scanner userInput = new Scanner(System.in);
    while (true){
      log("프린터할 문서를 입력하세요. 종료(q)");
      final String input = userInput.nextLine();
      if (input.equals("q")) {
        printerThread.interrupt();
        break;
      }
      printer.addJob(input);
    }


  }

  static class Printer implements Runnable {
    Queue<String> jobQueue = new ConcurrentLinkedQueue<>();

    @Override
    public void run() {
      while (!Thread.interrupted()) {
        if(jobQueue.isEmpty()) {
          continue;
        }

        try {
          final String job = jobQueue.poll();
          log("출력 시작: "+job+", 대기 문서: "+jobQueue);
          Thread.sleep(3000);
          log("출력 완료");
        }
        catch (InterruptedException e) {
          log("인터럽트!");
          break;
        }

      }
      log("프린터 종료");

    }

    public void addJob(String input) {
      jobQueue.offer(input);
    }
  }

}
