package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juan on 17/09/2015.
 */
public class IrregularBounceTest {
    @Test
    public void TestIrregularBounceTest(){
        IrregularBounce irregularBounce = new IrregularBounce();
        assertEquals("I'm bouncing irregularly!",irregularBounce.bounce());
    }
}
