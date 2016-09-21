package exercise01test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import exercise01.FactorialDouble;

public class FactorialDoubleTest {
    @Test
    public void getFactorialTest() throws Exception{
        FactorialDouble factorial = new FactorialDouble();
        assertEquals( 3840, factorial.getFactorialDouble(10) );
    }

}
