package model;

import com.econo.racingGame.model.Car;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CarTest {

    Car testCar;

    @Before
    public void setUp() throws Exception {
        testCar = new Car("기성");
    }

    @Test
    public void driverTest() {
        assertEquals("기성", testCar.getDriver());
    }

    @Test
    public void acceratTest() {
        testCar.accelerate(true);
        assertEquals(1, testCar.getMoveDistance());
    }

}