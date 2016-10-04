package ch.lazzaretti.exercise02;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Fabrizio on 27/09/2016.
 */
@RunWith(Parameterized.class)
public class ArrayFunctionAscendinglySortedTest {

    int[] inArray;
    int[] expectedArray;
    boolean expectedBool;

    public ArrayFunctionAscendinglySortedTest(int[] inArray, int[] expectedArray, boolean expectedBool){
        this.inArray = inArray;
        this.expectedArray = expectedArray;
        this.expectedBool = expectedBool;
    }

    @Test
    public void ascendingTest(){
        assertArrayEquals(expectedArray, ArrayFunction.sortAscending(inArray));
    }


    @Parameterized.Parameters
    public static Collection getData() {
        return Arrays.asList(new Object[][] {
                { new int[] {1,2,3}, new int[] {1,2,3}, true },
                { new int[] {8,5,3,2,1}, new int[] {1,2,3,5,8}, false },
                { new int[] {1,21,3,5,8}, new int[] {1,3,5,8,21}, false },
                { new int[] {1,21,1,3,5,8}, new int[] {1,1,3,5,8,21}, false },
                { new int[] {}, new int[] {}, true }
        });
    }
}
