package mx.iteso.strategy.LifeSaver;

import mx.iteso.strategy.balls.AmericanFootballBall;
import mx.iteso.strategy.behaviors.impl.IrregularBounce;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juan on 20/09/2015.
 */
public class ArmBandTest {
    @Test
    public void TestArmBandTest(){
        ArmBands armBands = new ArmBands();
        assertEquals("I'm floating", armBands.floating());
        assertEquals("I'm deflating!", armBands.performDeflate());
        assertEquals("I'm inflating!", armBands.performInflate());
    }
}
