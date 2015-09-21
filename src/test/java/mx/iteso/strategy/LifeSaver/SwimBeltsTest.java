package mx.iteso.strategy.LifeSaver;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juan on 20/09/2015.
 */
public class SwimBeltsTest {
    @Test
    public void TestSwimBeltsTest(){
        SwimBelts swimBelts = new SwimBelts();
        assertEquals("I'm floating", swimBelts.floating());
        assertEquals("I can't deflate!", swimBelts.performDeflate());
        assertEquals("I can't inflate!", swimBelts.performInflate());
    }
}
