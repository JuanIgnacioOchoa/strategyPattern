package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juan on 17/09/2015.
 */
public class NormalBounceTest {
    @Test
    public void TestNormalBounceTest(){
        NormalBounce normalBounce = new NormalBounce();
        assertEquals("I'm bouncing normally!",normalBounce.bounce());
    }
}
