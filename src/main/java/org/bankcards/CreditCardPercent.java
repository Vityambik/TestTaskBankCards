package org.bankcards;

public class CreditCardPercent extends CreditCard {

    CreditCardPercent(double creditLimit) {
        super(creditLimit);
    }

    @Override
    void topUpTheCard(double amount) {
        super.topUpTheCard(amount);
        System.out.println("Начисление по бонусной программе: " + (amount * 0.00005));
        super.topUpTheCard((amount * 0.00005));
    }
}
