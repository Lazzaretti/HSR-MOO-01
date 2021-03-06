package ch.lazzaretti.exercise02;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * http://stackoverflow.com/a/1119559/2801860
 */
public class LabyrinthFindAllPathsTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    /*@Test
    public void out() {
        String expected = "PATH: -> [0, 0] -> [0, 1] -> [0, 2] -> [1, 2] -> [1, 3] -> [2, 3] -> [3, 3] -> [3, 2] -> [3, 1] -> [2, 1] -> [2, 0] -> [3, 0] -> [4, 0] -> [5, 0] -> [6, 0] -> [6, 1] -> [6, 2] -> [5, 2] -> [5, 3] -> [5, 4] -> [6, 4] -> [6, 5] -> [6, 6] -> [5, 6] -> [5, 7] -> [6, 7] -> [7, 7] \r\n" +
                "PATH: -> [0, 0] -> [0, 1] -> [0, 2] -> [1, 2] -> [1, 3] -> [2, 3] -> [3, 3] -> [3, 2] -> [3, 1] -> [2, 1] -> [2, 0] -> [3, 0] -> [4, 0] -> [5, 0] -> [6, 0] -> [6, 1] -> [6, 2] -> [5, 2] -> [5, 3] -> [5, 4] -> [6, 4] -> [6, 5] -> [6, 6] -> [6, 7] -> [7, 7] \r\n" +
                "PATH: -> [0, 0] -> [0, 1] -> [0, 2] -> [1, 2] -> [1, 3] -> [2, 3] -> [3, 3] -> [3, 2] -> [3, 1] -> [3, 0] -> [4, 0] -> [5, 0] -> [6, 0] -> [6, 1] -> [6, 2] -> [5, 2] -> [5, 3] -> [5, 4] -> [6, 4] -> [6, 5] -> [6, 6] -> [5, 6] -> [5, 7] -> [6, 7] -> [7, 7] \r\n" +
                "PATH: -> [0, 0] -> [0, 1] -> [0, 2] -> [1, 2] -> [1, 3] -> [2, 3] -> [3, 3] -> [3, 2] -> [3, 1] -> [3, 0] -> [4, 0] -> [5, 0] -> [6, 0] -> [6, 1] -> [6, 2] -> [5, 2] -> [5, 3] -> [5, 4] -> [6, 4] -> [6, 5] -> [6, 6] -> [6, 7] -> [7, 7] \r\n" +
                "PATH: -> [0, 0] -> [0, 1] -> [0, 2] -> [0, 3] -> [1, 3] -> [2, 3] -> [3, 3] -> [3, 2] -> [3, 1] -> [2, 1] -> [2, 0] -> [3, 0] -> [4, 0] -> [5, 0] -> [6, 0] -> [6, 1] -> [6, 2] -> [5, 2] -> [5, 3] -> [5, 4] -> [6, 4] -> [6, 5] -> [6, 6] -> [5, 6] -> [5, 7] -> [6, 7] -> [7, 7] \r\n" +
                "PATH: -> [0, 0] -> [0, 1] -> [0, 2] -> [0, 3] -> [1, 3] -> [2, 3] -> [3, 3] -> [3, 2] -> [3, 1] -> [2, 1] -> [2, 0] -> [3, 0] -> [4, 0] -> [5, 0] -> [6, 0] -> [6, 1] -> [6, 2] -> [5, 2] -> [5, 3] -> [5, 4] -> [6, 4] -> [6, 5] -> [6, 6] -> [6, 7] -> [7, 7] \r\n" +
                "PATH: -> [0, 0] -> [0, 1] -> [0, 2] -> [0, 3] -> [1, 3] -> [2, 3] -> [3, 3] -> [3, 2] -> [3, 1] -> [3, 0] -> [4, 0] -> [5, 0] -> [6, 0] -> [6, 1] -> [6, 2] -> [5, 2] -> [5, 3] -> [5, 4] -> [6, 4] -> [6, 5] -> [6, 6] -> [5, 6] -> [5, 7] -> [6, 7] -> [7, 7] \r\n" +
                "PATH: -> [0, 0] -> [0, 1] -> [0, 2] -> [0, 3] -> [1, 3] -> [2, 3] -> [3, 3] -> [3, 2] -> [3, 1] -> [3, 0] -> [4, 0] -> [5, 0] -> [6, 0] -> [6, 1] -> [6, 2] -> [5, 2] -> [5, 3] -> [5, 4] -> [6, 4] -> [6, 5] -> [6, 6] -> [6, 7] -> [7, 7] \r\n";

        new LabyrinthFindAllPaths().findPath(0, 0, "PATH: ");
        Assert.assertEquals(expected, outContent.toString());
}//*/

    @Test(timeout = 2000)
    public void findPathTest(){

        new LabyrinthFindAllPaths().findPath(0, 0, "PATH: ");


        Pattern pattern = Pattern.compile("(PATH: -> (\\[\\d, \\d\\] -> ){1,100}\\[\\d, \\d\\] (\\r)?\\n){8}");
        Matcher matcher = pattern.matcher(outContent.toString());

        Assert.assertTrue(matcher.matches());

    }

}
