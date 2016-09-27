package exercise02;

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
public class ArrayFunctionRevertTest {

    int[] inArray;
    int[] expectedArray;

    public ArrayFunctionRevertTest(int[] inArray, int[] expectedArray){
        this.inArray = inArray;
        this.expectedArray = expectedArray;
    }

    @Test
    public void revertTest(){
        assertArrayEquals(expectedArray, ArrayFunction.revert(inArray));
    }


    @Parameterized.Parameters
    public static Collection getData() {
        return Arrays.asList(new Object[][] {
                { new int[] {1,2,3}, new int[] {3,2,1} },
                { new int[] {1,2,3,5,8}, new int[] {8,5,3,2,1} },
                { new int[] {1,21,3,5,8}, new int[] {8,5,3,21,1} }
        });
    }
}
