package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Juan on 17/09/2015.
 */
public class ExplodeTest {
    @Test
    public void TestExplodeTest(){
        Explode explode = new Explode();
        assertEquals("I can Explode",explode.Explode());
    }
}
