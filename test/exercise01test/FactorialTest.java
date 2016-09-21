package exercise01test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import exercise01.Factorial;

public class FactorialTest {
    @Test
    public void getFactorialTest() throws Exception{
        Factorial factorial = new Factorial();
        assertEquals( 3628800, factorial.getFactorial(10) );
    }

}
