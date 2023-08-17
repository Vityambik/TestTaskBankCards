package org.bankcards;

import com.google.common.util.concurrent.AtomicDouble;

public class DebitCardCashBack extends DebitCard {

    private final AtomicDouble charges = new AtomicDouble(0);

    @Override
    boolean payByCard(double amount) {
        if (super.payByCard(amount)) {
            charges.addAndGet(amount);
            if(charges.get() > 5000) {
                System.out.println("Начисление кэшбэка по бонусной программе: " + amount * 0.05);
                super.topUpTheCard(amount * 0.05);
            }
            return true;
        }
        return false;
    }
}
