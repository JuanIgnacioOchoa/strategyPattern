package mx.iteso.strategy.balls;

import mx.iteso.strategy.behaviors.impl.NormalBounce;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juan on 17/09/2015.
 */
public class TennisBallTest {
    @Test
    public void testTennisBall() {
        TennisBall tennisBall = new TennisBall(new NormalBounce());
        assertEquals("I'm bouncing normally!", tennisBall.performBounce());
        assertEquals("I'm deflating!", tennisBall.performDeflate());
        assertEquals("I'm inflating!", tennisBall.performInflate());
        assertEquals("Tennis ball is rolling!", tennisBall.roll());
    }
}
