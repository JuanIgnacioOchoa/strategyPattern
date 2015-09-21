package mx.iteso.strategy.LifeSaver;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juan on 20/09/2015.
 */
public class LifeVestsTest {
    @Test
    public void TestLifeVestsTest(){
        LifeVests lifeVests = new LifeVests();
        assertEquals("I'm floating", lifeVests.floating());
        assertEquals("I can't deflate!", lifeVests.performDeflate());
        assertEquals("I can't inflate!", lifeVests.performInflate());
    }
}
