package org.bankcards;

import org.junit.Assert;
import org.junit.Test;

public class CreditCardPercentTest {

    @Test
    public void testTopUpTheCard() {
        CreditCardPercent creditCardPercent = new CreditCardPercent(7500);
        creditCardPercent.topUpTheCard(50000);
        Assert.assertEquals(50002.5, creditCardPercent.getBalance(), 0);
    }
}
