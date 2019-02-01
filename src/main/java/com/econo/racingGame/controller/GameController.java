package com.econo.racingGame.controller;

import com.econo.racingGame.model.Car;

import java.util.Random;
import java.util.stream.Stream;

public class GameController {

    private final static int MOVE_BOUNDARY = 4;
    private final static int RANDOM_BOUNDARY = 10;
    private Car[] cars;

    public void makeCars(int carNumbers){
        cars = new Car[carNumbers];
        for(int i = 0; i<carNumbers;i++){
            cars[i] = new Car();
        }
    }

    public void settingCars(String[] names) {
        makeCars(names.length);
        for (int i = 0; i < cars.length; i++) {
            cars[i].setDriver(names[i]);
        }
    }

    public int makeRandomNumber() {
        Random random = new Random();
        return random.nextInt(RANDOM_BOUNDARY);
    }

    public boolean isAccerate(int randomNumber) {
        if (randomNumber >= MOVE_BOUNDARY) {
            return true;
        }
        return false;
    }

    public void accerateCar(int turn, int tryNumber){
        for(int i = 0 ;i<tryNumber;i++){
            cars[turn].accelerate(isAccerate(makeRandomNumber()));
        }
    }

    public void accerateCars(int tryNumber){
        for(int i = 0;i<cars.length;i++){
            accerateCar(i,tryNumber);
        }
    }

}