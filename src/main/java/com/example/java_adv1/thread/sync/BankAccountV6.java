package com.example.java_adv1.thread.sync;

import static com.example.java_adv1.util.MyLogger.log;
import static com.example.java_adv1.util.ThreadUtils.sleep;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccountV6 implements BankAccount {

  private int balance;
  private final Lock lock = new ReentrantLock();

  public BankAccountV6(int initialBalance) {
    this.balance = initialBalance;
  }

  @Override
  public boolean withdraw(int amount) {
    log("거래 시작: " + getClass().getSimpleName());

    try {
      if (!lock.tryLock(500, TimeUnit.MILLISECONDS)) {
        log("[진입 실패] 이미 처리중인 작업이 있습니다.");
        return false;
      }
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    try {
      log("[검증 시작] 출금액:" + amount + ", 잔액:" + balance);
      if (balance < amount) {
        log("[검증 실패] 출금액:" + amount + ", 잔액:" + balance);
        return false;
      }

      log("[검증 완료] 출금액:" + amount + ", 잔액:" + balance);
      sleep(1000);
      balance -= amount;
      log("[출금 완료] 출금액:" + amount + ", 잔액:" + balance);
    } finally { //finally 필수, waiting 상태에 빠지지 않기 위함
      lock.unlock();  // unlock 필수,
    }

    log("거래 종료");
    return true;
  }

  @Override
  public int getBalance() {
    lock.lock();
    try {
      return balance;
    } finally {
      lock.unlock();
    }
  }

}
