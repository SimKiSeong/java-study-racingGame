package utils;

import com.econo.racingGame.utils.StringGenerator;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class StringGeneratorTest {

    @Test
    public void divideCommaTest() {
        String[] testString = new String[]{"기성","기성","기성"};
        assertArrayEquals(testString,StringGenerator.divideComma("기성,기성,기성"));
    }

}