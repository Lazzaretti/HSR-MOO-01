package exercise01test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import exercise01.PrimeNumber;

public class PrimeNumberTest {
	
	PrimeNumber object;
	
	@Before
	public void startUp(){
        object = new PrimeNumber();
	}
	
    @Test
    public void getFactorialTest() throws Exception{
        assertEquals( true, object.isPrimeNumber(2) );
        assertEquals( false, object.isPrimeNumber(10) );
        assertEquals( true, object.isPrimeNumber(13) );
        assertEquals( false, object.isPrimeNumber(1) );
        assertEquals( false, object.isPrimeNumber(0) );
    }
    
    @Test
    public void getPrimeNumbersTest(){
    	ArrayList<Integer> primes = new ArrayList<>();
    	assertEquals(primes, object.getPrimeNumbers(0));
    	primes.add(new Integer(2));
    	assertEquals(primes, object.getPrimeNumbers(1));
    	primes.add(new Integer(3));
    	assertEquals(primes, object.getPrimeNumbers(2));
    	primes.add(new Integer(5));
    	assertEquals(primes, object.getPrimeNumbers(3));
    }

}
