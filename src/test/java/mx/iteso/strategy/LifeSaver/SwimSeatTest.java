package mx.iteso.strategy.LifeSaver;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juan on 20/09/2015.
 */
public class SwimSeatTest {
    @Test
    public void TestSwimSeatTest(){
        SwimSeat swimSeat = new SwimSeat();
        assertEquals("I'm floating", swimSeat.floating());
        assertEquals("I'm deflating!", swimSeat.performDeflate());
        assertEquals("I'm inflating!", swimSeat.performInflate());
    }
}
