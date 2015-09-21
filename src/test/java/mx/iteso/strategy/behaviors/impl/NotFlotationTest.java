package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 * Created by Juan on 20/09/2015.
 */
public class NotFlotationTest {
    @Test
    public void TestNotFlotationTest(){
        NotFlotation notFlotation = new NotFlotation();
        assertEquals("I can't float",notFlotation.flotation());
    }
}
