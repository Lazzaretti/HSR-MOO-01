package exercise01test;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import exercise01.FactorialDouble;

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
