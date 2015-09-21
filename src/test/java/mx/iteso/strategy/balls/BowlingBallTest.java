package mx.iteso.strategy.balls;

import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juan on 17/09/2015.
 */
public class BowlingBallTest {
    @Test
    public void testBowling() {
        BowlingBall bowlingBall = new BowlingBall(new IrregularBounce());
        assertEquals("I'm bouncing irregularly!", bowlingBall.performBounce());
        assertEquals("I can't deflate!", bowlingBall.performDeflate());
        assertEquals("I can't inflate!", bowlingBall.performInflate());
        assertEquals("Bowling ball is rolling!", bowlingBall.roll());
    }
}