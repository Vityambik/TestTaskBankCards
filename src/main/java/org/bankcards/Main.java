package org.bankcards;

public class Main {

    public static void main(String[] args) {
        startCardTransactions(new DebitCard());
        startCardTransactions(new DebitCardBonus());
        startCardTransactions(new DebitCardCashBack());
        startCardTransactions(new CreditCard(10000));
        startCardTransactions(new CreditCardPercent(10000));
    }

    private static void startCardTransactions(BankCard bankCard) {
        bankCard.getBalanceInform();
        bankCard.payByCard(6000);
        bankCard.getBalanceInform();
        bankCard.topUpTheCard(15000);
        bankCard.getBalanceInform();
        bankCard.payByCard(10900);
        bankCard.getBalanceInform();
        bankCard.payByCard(100);
        bankCard.getBalanceInform();
        bankCard.payByCard(500);
        bankCard.getBalanceInform();
        System.out.print("\n\n");
    }
}
