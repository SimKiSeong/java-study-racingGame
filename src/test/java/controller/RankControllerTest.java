package controller;

import com.econo.racingGame.controller.RankController;
import com.econo.racingGame.model.Car;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class RankControllerTest {

    private RankController rankController;
    private List<Car> cars = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        rankController = new RankController();
        cars.add(new Car("기성1",3));
        cars.add(new Car("기성2",4));
        cars.add(new Car("기성3",5));
    }

    @Test
    public void findWinnerTest() {
        String[] testString = new String[]{"기성3"};
        assertArrayEquals(testString, rankController.findWinner(cars));
    }

    @Test
    public void farDistanceTest() {
        assertEquals(5, rankController.farDistance(cars));
    }

    @Test
    public void checkWinnerTest() {
        assertEquals("기성3", rankController.checkWinner(5,cars.get(2)));
    }

}
