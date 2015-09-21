package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Juan on 17/09/2015.
 */
public class NotExplodeTest {
    @Test
    public void TestNotExplodeTest(){
        NotExplode notExplode = new NotExplode();
        assertEquals("I can't Explode",notExplode.Explode());
    }
}
