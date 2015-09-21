package mx.iteso.strategy.LifeSaver;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juan on 20/09/2015.
 */
public class FoamFLoatTest {
    @Test
    public void TestfoamFloatsTest(){
        FoamFloats foamFloats = new FoamFloats();
        assertEquals("I'm floating", foamFloats.floating());
        assertEquals("I can't deflate!", foamFloats.performDeflate());
        assertEquals("I can't inflate!", foamFloats.performInflate());
    }
}
