package mx.iteso.strategy.behaviors.impl;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Juan on 17/09/2015.
 */
public class NotDefatableTest {
    @Test
    public void TestNotDefatableTest(){
        NotDeflatable notDeflatable = new NotDeflatable();
        assertEquals("I can't deflate!", notDeflatable.deflate());
    }

    @Test
    public void TestNotInflatableTest(){
        NotDeflatable notDeflatable = new NotDeflatable();
        assertEquals("I can't inflate!", notDeflatable.inflate());
    }

}
