package org.bankcards;

class CreditCard extends BankCard {

    private final double creditLimit;

    public CreditCard(double creditLimit) {
        this.creditLimit = Math.abs(creditLimit);
    }

    @Override
    boolean payByCard(double amount) {
        return this.payByCard(amount, -creditLimit);
    }

    @Override
    void getBalanceInform() {
        double balance = this.getBalance();
        System.out.println("Кредитные средства: " + (balance > 0 ? creditLimit : creditLimit + balance));
        System.out.println("Собственные средства: " + (balance > 0 ? balance : 0.0));
    }
}
