package com.econo.racingGame.controller;

import com.econo.racingGame.model.Car;
import com.econo.racingGame.utils.RandomGenerator;

import java.util.ArrayList;
import java.util.List;

public class GameController {

    private final static int MOVE_BOUNDARY = 4;
    private final static int RANDOM_BOUNDARY = 10;
    private List<Car> cars = new ArrayList<>();

    public List<Car> getCars() {
        return cars;
    }

    public void makeCars(String[] driverNames) {
        for (String driver : driverNames) {
            cars.add(new Car(driver));
        }
    }

    public boolean isAccerate(int randomNumber) {
        if (randomNumber >= MOVE_BOUNDARY) {
            return true;
        }
        return false;
    }

    public void accerateCar(Car car, int tryNumber) {
        for (int i = 0; i < tryNumber; i++) {
            car.accelerate(isAccerate(RandomGenerator.makeRandomValue(RANDOM_BOUNDARY)));
        }
    }

    public void accerateCars(int tryNumber) {
        for (Car car : cars) {
            accerateCar(car, tryNumber);
        }
    }

}