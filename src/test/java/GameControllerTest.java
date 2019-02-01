import com.econo.racingGame.model.Car;
import com.econo.racingGame.controller.GameController;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GameControllerTest {

    private GameController gameController;
    private String testString[];
    private int testTryNumber;

    @Before
    public void setUp() throws Exception {
        gameController = new GameController();
        testString = new String[]{"기성", "기성", "기성"};
        testTryNumber = 5;
        gameController.makeCars(testString.length);
    }

    @Test
    public void checkRandomNumberTest() {
        assertEquals(true, gameController.isAccerate(4));

    }

    public boolean isDistanceEquals(int tryNumber, int distance) {
        if (tryNumber >= distance) {
            return true;
        }
        return false;
    }

    public boolean isCarNumberEquals(int carNumber, Car[] cars) {
        if (cars.length == carNumber) {
            return true;
        }
        return false;
    }

}