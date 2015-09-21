package mx.iteso.strategy.balls;

import mx.iteso.strategy.behaviors.impl.Crash;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juan on 17/09/2015.
 */
public class CrystalBallTest {
    @Test
    public void testCrystalBall() {
        CrystalBall crystalBall = new CrystalBall(new Crash());
        assertEquals("I crashed!! I can't bounce", crystalBall.performBounce());
        assertEquals("I can't deflate!", crystalBall.performDeflate());
        assertEquals("I can't inflate!", crystalBall.performInflate());
        assertEquals("Crystal ball is rolling!", crystalBall.roll());
    }

}
