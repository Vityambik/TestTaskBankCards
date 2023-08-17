package org.bankcards;

import org.junit.Assert;
import org.junit.Test;

public class DebitCardCashBackTest {

    @Test
    public void testPayByCardWithoutCashBack() {
        DebitCardCashBack debitCardCashBack = new DebitCardCashBack();
        debitCardCashBack.topUpTheCard(10000);
        Assert.assertTrue(debitCardCashBack.payByCard(5000));
        Assert.assertEquals(5000, debitCardCashBack.getBalance(), 0);
    }

    @Test
    public void testPayByCardWithCashBack() {
        DebitCardCashBack debitCardCashBack = new DebitCardCashBack();
        debitCardCashBack.topUpTheCard(15000);
        Assert.assertTrue(debitCardCashBack.payByCard(10000));
        Assert.assertEquals(5500, debitCardCashBack.getBalance(), 0);
    }
}
