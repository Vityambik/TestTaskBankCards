package org.bankcards;

import org.junit.Assert;
import org.junit.Test;

public class DebitCardBonusTest {

    @Test
    public void testPayByCard() {
        DebitCardBonus debitCardBonus = new DebitCardBonus();
        debitCardBonus.topUpTheCard(20000);
        debitCardBonus.payByCard(17000);
        Assert.assertEquals(170, debitCardBonus.getBonusPoints(), 0);
    }
}
