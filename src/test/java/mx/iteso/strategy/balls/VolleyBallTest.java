package mx.iteso.strategy.balls;

import mx.iteso.strategy.behaviors.impl.NormalBounce;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juan on 17/09/2015.
 */
public class VolleyBallTest {
    @Test
    public void testVolleyBall() {
        VolleyBall volleyBall = new VolleyBall(new NormalBounce());
        assertEquals("I'm bouncing normally!", volleyBall.performBounce());
        assertEquals("I'm deflating!", volleyBall.performDeflate());
        assertEquals("I'm inflating!", volleyBall.performInflate());
        assertEquals("Volley ball is rolling!", volleyBall.roll());
    }
}
