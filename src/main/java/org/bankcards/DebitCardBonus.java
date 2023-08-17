package org.bankcards;

import java.util.concurrent.atomic.AtomicInteger;

public class DebitCardBonus extends DebitCard {

    private final AtomicInteger bonusPoints = new AtomicInteger(0);

    int getBonusPoints() {
        return bonusPoints.get();
    }

    @Override
    boolean payByCard(double amount) {
        if (super.payByCard(amount)) {
            bonusPoints.addAndGet((int) Math.round(amount * 0.01));
            System.out.println("Начисление бонусов по бонусной программе: " + (int) Math.round(amount * 0.01));
            System.out.println("Доступное количество бонусов: " + bonusPoints);
            return true;
        }
        return false;
    }
}
