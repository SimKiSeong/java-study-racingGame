package utils;

import com.econo.racingGame.utils.RandomGenerator;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RandomGeneratorTest {

    @Test
    public void randomValueTest() {
        assertEquals(0, RandomGenerator.makeRandomValue(5),5);
    }

}