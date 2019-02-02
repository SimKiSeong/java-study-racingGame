package com.econo.racingGame.controller;

import com.econo.racingGame.model.Car;
import com.econo.racingGame.utils.StringGenerator;

import java.util.List;

public class RankController {

    private final String NONE = "";

    public String checkWinner(int farDistance, Car car) {
        if (farDistance == car.getMoveDistance()) {
            return car.getDriver();
        }
        return NONE;
    }

    public String[] findWinner(List<Car> cars) {
        String winner = new String();
        int farDistance = farDistance(cars);
        for (Car car : cars) {
            winner = winner + checkWinner(farDistance, car);
        }
        return StringGenerator.divideComma(winner);
    }

    public int farDistance(List<Car> cars) {
        int farDistance = 0;
        for (Car car : cars) {
            farDistance = Math.max(farDistance, car.getMoveDistance());
        }
        return farDistance;
    }

}
