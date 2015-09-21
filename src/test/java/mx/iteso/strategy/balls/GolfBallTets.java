package mx.iteso.strategy.balls;

import mx.iteso.strategy.behaviors.impl.Crash;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juan on 17/09/2015.
 */
public class GolfBallTets {
    @Test
    public void testGolfBall() {
        GolfBall golfBall = new GolfBall(new NormalBounce());
        assertEquals("I'm bouncing normally!", golfBall.performBounce());
        assertEquals("I can't deflate!", golfBall.performDeflate());
        assertEquals("I can't inflate!", golfBall.performInflate());
        assertEquals("Golf ball is rolling!", golfBall.roll());
    }

}
