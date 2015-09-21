package mx.iteso.strategy.LifeSaver;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juan on 20/09/2015.
 */
public class LifeSaverCandiesTest {
    @Test
    public void TestLifeSaverCandiesTest(){
        LifeSaverCandies lifeSaverCandies = new LifeSaverCandies();
        assertEquals("I'm floating", lifeSaverCandies.floating());
        assertEquals("I'm deflating!", lifeSaverCandies.performDeflate());
        assertEquals("I'm inflating!", lifeSaverCandies.performInflate());
    }
}
