package mx.iteso.strategy.LifeSaver;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juan on 20/09/2015.
 */
public class SwimRingTest {
    @Test
    public void TestSwimRingTest(){
        SwimRing swimRing = new SwimRing();
        assertEquals("I'm floating", swimRing.floating());
        assertEquals("I'm deflating!", swimRing.performDeflate());
        assertEquals("I'm inflating!", swimRing.performInflate());
    }
}
