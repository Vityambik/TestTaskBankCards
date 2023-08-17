package org.bankcards;

class DebitCard extends BankCard {

    @Override
    boolean payByCard(double amount) {
        return this.payByCard(amount, 0);
    }

    @Override
    void getBalanceInform() {
        System.out.println("Средства дебетовой карты: " + this.getBalance());
    }
}
