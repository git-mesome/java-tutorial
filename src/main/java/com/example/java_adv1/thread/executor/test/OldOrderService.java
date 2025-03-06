package com.example.java_adv1.thread.executor.test;

import static com.example.java_adv1.util.MyLogger.log;
import static com.example.java_adv1.util.ThreadUtils.sleep;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class OldOrderService {

  public void order(String orderNo) throws InterruptedException, ExecutionException {
    boolean done = false;

    ExecutorService executorService = Executors.newFixedThreadPool(3);

    List<Callable<String>> works = List.of(
        new InventoryWork(orderNo),
        new ShippingWork(orderNo),
        new AccountingWork(orderNo)
    );

    List<Future<String>> futures = executorService.invokeAll(works);
    for (Future<String> future : futures) {
      done = future.isDone();
    }

    if (done) {
      log("모든 주문 처리가 성공적으로 완료되었습니다.");
    } else {
      log("일부 작업이 실패했습니다.");
    }
  }

  static class InventoryWork implements Callable<String> {

    private final String orderNo;

    InventoryWork(String orderNo) {
      this.orderNo = orderNo;
    }

    @Override
    public String call() throws Exception {
      log("재고 업데이트: " + orderNo);
      sleep(1000);
      return orderNo;
    }
  }

  static class ShippingWork implements Callable<String> {

    private final String orderNo;

    public ShippingWork(String orderNo) {
      this.orderNo = orderNo;
    }

    @Override
    public String call() throws Exception {
      log("배송 시스템 알림: " + orderNo);
      sleep(1000);
      return orderNo;
    }
  }

  static class AccountingWork implements Callable<String> {

    private final String orderNo;

    AccountingWork(String orderNo) {
      this.orderNo = orderNo;
    }

    @Override
    public String call() throws Exception {
      log("회계 시스템 업데이트: " + orderNo);
      sleep(1000);
      return orderNo;
    }
  }
}
