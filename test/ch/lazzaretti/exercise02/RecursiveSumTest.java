package ch.lazzaretti.exercise02;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecursiveSumTest {
    @Test
    public void mainTest(){
        assertEquals(4519,RecursiveSum.getSum(RecursiveSum.randomSeries(1000)));
    }

    @Test
    public void emptyTest(){
        assertEquals(0,RecursiveSum.getSum(new int[0]));
    }

}
