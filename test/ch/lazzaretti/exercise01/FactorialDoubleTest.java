package ch.lazzaretti.exercise01;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FactorialDoubleTest {

    protected FactorialDouble factorial;

    @Before
    public void setUp(){
        factorial = new FactorialDouble();
    }

    @Test
    public void getFactorialTest() throws Exception{
        assertEquals( 3840, factorial.getFactorialDouble(10) );
    }

}
