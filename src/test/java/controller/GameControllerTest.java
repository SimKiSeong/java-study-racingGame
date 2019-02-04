package controller;

import com.econo.racingGame.controller.GameController;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GameControllerTest {

    private GameController gameController;
    private String testString[];

    @Before
    public void setUp() throws Exception {
        gameController = new GameController();
        testString = new String[]{"기성", "기성", "기성"};
        gameController.makeCars(testString);
    }

    @Test
    public void isAccerateTest() {
        assertEquals(true, gameController.isAccerate(4));
    }

    @Test
    public void accerateCarTest() {
        gameController.accerateCar(gameController.getCars().get(0),4);
        assertEquals(0,gameController.getCars().get(0).getMoveDistance() ,4);
    }

}