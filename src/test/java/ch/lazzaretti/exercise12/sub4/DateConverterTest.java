package ch.lazzaretti.exercise12.sub4;

import ch.lazzaretti.exercise12.sub4.DateConverter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * Created by fab on 07.12.2016.
 */
@RunWith(Parameterized.class)
public class DateConverterTest {
    String us;
    String exp;

    public DateConverterTest(String us, String exp){
        this.us = us;
        this.exp = exp;
    }

    @Test
    public void convertUsToEuTest(){
        String eu = DateConverter.convertUsToEu(us);
        assertEquals(exp,eu);
    }

    @Parameterized.Parameters
    public static Collection getData() {
        return Arrays.asList(new Object[][]{
                {"Thu 12/8/2016 10:15 AM", "Do 8.12.2016 10:15"},
                {"Sat 12/24/2016 8:00 PM","Sa 24.12.2016 20:00"},
                {"Sun 1/1/2017 12:00 AM","So 1.1.2017 0:00"}
        });
    }
}
