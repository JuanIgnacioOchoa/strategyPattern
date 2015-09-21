package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juan on 20/09/2015.
 */
public class FlotationTest {
    @Test
    public void TestFlotationTest(){
        Floatation floatation = new Floatation();
        assertEquals("I'm floating",floatation.flotation());
    }
}
