package com.econo.racingGame.model;

public class Car {

    private final int ONCE_DISTANCE = 1;

    private int moveDistance;
    private String driver;

    public Car(){
        this.driver = "";
        this.moveDistance = 0;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getMoveDistance() {
        return moveDistance;
    }

    public void setMoveDistance(int moveDistance) {
        this.moveDistance = moveDistance;
    }

    public void accelerate(boolean goFoward) {
        if(goFoward) {
            moveDistance = moveDistance + ONCE_DISTANCE;
        }
    }

}