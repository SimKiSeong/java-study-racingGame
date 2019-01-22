import com.econo.racingGame.controller.RankController;
import com.econo.racingGame.model.Car;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class RankControllerTest {

    private Car[] cars;
    private RankController rankController;

    @Before
    public void setUp() throws Exception {
        rankController = new RankController();
        cars = new Car[2];
        cars[0] = new Car();
        cars[1] = new Car();
        cars[0].setDriver("기성1");
        cars[0].setMoveDistance(5);
        cars[1].setDriver("기성2");
        cars[1].setMoveDistance(4);
    }

    @Test
    public void findWinnerTest() {
        assertEquals("기성2", rankController.findWinner(4,cars[1]));
    }


    @Test
    public void returnWinnerTest() {
        assertEquals(true,Arrays.equals(new String[]{"기성1"}, rankController.returnWinner(cars)));
    }

    @Test
    public void findFarDistanceTest() {
        assertEquals(5, rankController.findFarDistance(cars));
    }

    @Test
    public void bigIntegerTest() {
        assertEquals(1, rankController.bigInteger(1,0));
    }


}
