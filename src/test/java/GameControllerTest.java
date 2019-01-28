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
        assertEquals(1, gameController.checkRandomNumber(4));

    }

    @Test
    public void returnDistance() {
        assertEquals(true, isDistanceEquals(testTryNumber, gameController.distance(testTryNumber)));
    }

    @Test
    public void makeCarsTest() {
        assertEquals(true, isCarNumberEquals(testString.length, gameController.settingCars(testString, testTryNumber)));
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