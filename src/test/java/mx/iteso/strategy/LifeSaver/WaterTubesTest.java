package mx.iteso.strategy.LifeSaver;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juan on 20/09/2015.
 */
public class WaterTubesTest {
    @Test
    public void TestWaterTubesTest(){
        WaterTubes waterTubes = new WaterTubes();
        assertEquals("I'm floating", waterTubes.floating());
        assertEquals("I can't deflate!", waterTubes.performDeflate());
        assertEquals("I can't inflate!", waterTubes.performInflate());
    }
}
