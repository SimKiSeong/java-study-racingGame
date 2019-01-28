package com.econo.racingGame.controller;

import com.econo.racingGame.model.Car;

import java.util.Random;

public class GameController {

    private final static int MOVE_BOUNDARY = 4;
    private final static int RANDOM_BOUNDART = 10;
    private final static int GO = 1;
    private final static int STOP = 0;
    private Car[] cars;

    public void makeCars(int carNumbers) {
        cars = new Car[carNumbers];
        for (int i = 0;i<carNumbers;i++) {
            cars[i] = new Car();
        }
    }

    public Car[] settingCars(String[] names, int tryNumber) {
        for (int i = 0; i < cars.length; i++) {
            cars[i].setDriver(names[i]);
            cars[i].setMoveDistance(distance(tryNumber));
        }
        return cars;
    }

    public int randomNumber() {
        Random random = new Random();
        return random.nextInt(RANDOM_BOUNDART);
    }

    public int distance(int tryNumber) {
        int distance = 0;
        for (int i = 0; i < tryNumber; i++) {
            distance = distance + checkRandomNumber(randomNumber());
        }
        return distance;
    }

    public int checkRandomNumber(int randomNumber) {
        if (randomNumber >= MOVE_BOUNDARY) {
            return GO;
        }
        return STOP;
    }

}