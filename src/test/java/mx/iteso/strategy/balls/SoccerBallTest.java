package mx.iteso.strategy.balls;

import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juan on 17/09/2015.
 */
public class SoccerBallTest {
    @Test
    public void testSoccerBall() {
        SoccerBall soccerBall = new SoccerBall(new NormalBounce());
        assertEquals("I'm bouncing normally!", soccerBall.performBounce());
        assertEquals("I'm deflating!", soccerBall.performDeflate());
        assertEquals("I'm inflating!", soccerBall.performInflate());
        assertEquals("Soccer ball is rolling!", soccerBall.roll());
    }
}
