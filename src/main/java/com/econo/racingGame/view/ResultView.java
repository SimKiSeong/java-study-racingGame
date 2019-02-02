package com.econo.racingGame.view;

import com.econo.racingGame.model.Car;

import java.util.List;

public class ResultView {

    private static final String BAR = "-";
    private static final String RESULT_FORM = " : ";
    private static final String WINNER_FORM = ", ";
    private static final String WINNER_MENT = "가 최종 우승했습니다.";

    public static void printResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(resultString(car));
        }
    }

    private static String resultString(Car car) {
        String resultString = car.getDriver() + RESULT_FORM;
        for (int i = 0; i < car.getMoveDistance(); i++) {
            resultString = resultString.concat(BAR);
        }
        return resultString;
    }

    public static void printWinner(String[] winner) {
        System.out.print(winner[0]);
        for (int i = 1; i < winner.length; i++) {
            System.out.print(WINNER_FORM + winner[i]);
        }
        System.out.println(WINNER_MENT);
    }

}