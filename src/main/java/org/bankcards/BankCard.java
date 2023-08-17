package org.bankcards;

import com.google.common.util.concurrent.AtomicDouble;

abstract class BankCard {

    private final AtomicDouble balance = new AtomicDouble(0);

    double getBalance() {
        return balance.get();
    }

    void setBalance(double balance) {
        this.balance.addAndGet(balance);
    }

    void topUpTheCard(double amount) {
        setBalance(amount);
        System.out.println("Пополнение средств: " + amount);
    }

    abstract boolean payByCard(double amount);

    abstract void getBalanceInform();

    boolean payByCard(double amount, double limit) {
        double balanceAfterPay = getBalance() - amount;
        if (balanceAfterPay >= limit) {
            setBalance(-amount);
            System.out.println("Списание средств: " + amount);
            return true;
        }
        System.out.println("Попытка оплаты: " + amount);
        System.out.println("Ошибка! недостаточно средств. Пополните счёт!");
        return false;
    }
}

