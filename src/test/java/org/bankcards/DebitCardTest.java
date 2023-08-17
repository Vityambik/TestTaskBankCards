package org.bankcards;

import org.junit.Assert;
import org.junit.Test;

public class DebitCardTest {

    @Test
    public void testPayByCard() {
        DebitCard debitCard = new DebitCard();
        Assert.assertFalse(debitCard.payByCard(500));
        Assert.assertEquals(0, debitCard.getBalance(), 0);
    }

    @Test
    public void testTopUpTheCard() {
        DebitCard debitCard = new DebitCard();
        debitCard.topUpTheCard(500);
        Assert.assertEquals(500, debitCard.getBalance(), 0);
    }

    @Test
    public void testTopUpAndPayByCard() {
        DebitCard debitCard = new DebitCard();
        debitCard.topUpTheCard(1000);
        Assert.assertTrue(debitCard.payByCard(500));
        Assert.assertEquals(500, debitCard.getBalance(), 0);
        Assert.assertFalse(debitCard.payByCard(5000));
    }
}
