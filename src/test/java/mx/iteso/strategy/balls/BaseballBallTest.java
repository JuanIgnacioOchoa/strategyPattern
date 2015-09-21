package mx.iteso.strategy.balls;

import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import mx.iteso.strategy.behaviors.impl.NormalBounce;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juan on 17/09/2015.
 */
public class BaseballBallTest {
    @Test
    public void testBaseballBall() {
        BaseballBall baseballBall = new BaseballBall(new NormalBounce());
        assertEquals("I'm bouncing normally!", baseballBall.performBounce());
        assertEquals("I can't deflate!", baseballBall.performDeflate());
        assertEquals("I can't inflate!", baseballBall.performInflate());
        assertEquals("Baseball ball is rolling!", baseballBall.roll());
    }
}
