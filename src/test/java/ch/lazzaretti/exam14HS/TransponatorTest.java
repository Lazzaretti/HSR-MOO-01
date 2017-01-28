package ch.lazzaretti.exam14HS;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fab on 23.01.2017.
 */
public class TransponatorTest {
    @Test
    public void testNormal(){
        assertEquals(new int[][]{{1,4},{2,5},{3,6}},Transponator.transponate(new int[][]{{1,2,3},{4,5,6}}));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNull(){
        Transponator.transponate(null);
    }
}
