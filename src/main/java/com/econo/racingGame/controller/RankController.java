package com.econo.racingGame.controller;

import com.econo.racingGame.model.Car;

public class RankController {

    private final String SPLIT_MARK = ",";
    private final String NONE = "";

    public String checkWinner(int farDistance, Car car) {
        if (farDistance == car.getMoveDistance()) {
            return car.getDriver();
        }
        return NONE;
    }

    public String[] winner(Car[] cars) {
        String winner = new String();
        int farDistance = farDistance(cars);
        for (int i = 0; i < cars.length; i++) {
            winner = winner + checkWinner(farDistance, cars[i]);
        }
        return winner.split(SPLIT_MARK);
    }

    public int farDistance(Car[] cars) {
        int farDistance = 0;
        for (int i = 0; i < cars.length; i++) {
            farDistance = Math.max(farDistance, cars[i].getMoveDistance());
        }
        return farDistance;
    }

}
