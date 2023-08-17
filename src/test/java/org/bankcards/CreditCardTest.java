package org.bankcards;

import org.junit.Assert;
import org.junit.Test;

public class CreditCardTest {

    @Test
    public void testPayByCard() {
        CreditCard creditCard = new CreditCard(15000);
        Assert.assertFalse(creditCard.payByCard(15500));
        Assert.assertEquals(0, creditCard.getBalance(), 0);
    }
}
