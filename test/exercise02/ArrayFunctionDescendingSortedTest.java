package exercise02;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by Fabrizio on 27/09/2016.
 */
@RunWith(Parameterized.class)
public class ArrayFunctionDescendingSortedTest {

    int[] inArray;
    boolean answer;

    public ArrayFunctionDescendingSortedTest(int[] inArray, boolean answer){
        this.inArray = inArray;
        this.answer = answer;
    }

    @Test
    public void descendingTest(){
        assertEquals(answer, ArrayFunction.descendinglySorted(inArray));
    }


    @Parameterized.Parameters
    public static Collection getData() {
        return Arrays.asList(new Object[][] {
                { new int[] {1,2,3}, false },
                { new int[] {8,5,3,2,1}, true },
                { new int[] {1,21,3,5,8}, false },
                { new int[] {1,21,1,3,5,8}, false },
                { new int[] {3,2}, true },
                { new int[] {5,5,3,1}, true },
                { new int[] {9}, true },
                { new int[] {}, true }
        });
    }
}
