package com.econo.racingGame.controller;

import com.econo.racingGame.model.Car;

public class RankController {

    private final String SPLIT_MARK = ",";
    private final String NONE = "";

    public String findWinner(int farDistance,Car car){
        if(farDistance==car.getMoveDistance()){
            return car.getDriver();
        }
        return NONE;
    }

    public String[] returnWinner(Car[] cars){
        String winner = new String();
        int farDistance = findFarDistance(cars);
        for(int i = 0;i<cars.length;i++){
            winner = winner + findWinner(farDistance,cars[i]);
        }
        return winner.split(SPLIT_MARK);
    }

    public int findFarDistance(Car[] cars){
        int farDistance = 0;
        for(int i = 0;i<cars.length;i++){
            farDistance = bigInteger(farDistance,cars[i].getMoveDistance());
        }
        return farDistance;
    }

    public int bigInteger(int a, int b){
        if(a>b){
            return a;
        }
        return b;
    }

}
