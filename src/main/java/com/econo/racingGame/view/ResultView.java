package com.econo.racingGame.view;

import com.econo.racingGame.model.Car;

public class ResultView {

    private static final char BAR = '-';
    private static final String RESULT_FORM = " : ";
    private static final String WINNER_FORM = ", ";

    public static void printResult(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            System.out.println(makeResultString(cars[i]));
        }
    }

    public static String makeResultString(Car car) {
        String resultString = car.getDriver() + RESULT_FORM;
        for (int i = 0; i < car.getMoveDistance(); i++) {
            resultString = resultString + BAR;
        }
        return resultString;
    }

    private void printWinner(String[] winner) {
        System.out.print(winner[0]);
        for (int i = 1; i < winner.length; i++) {
            System.out.print(WINNER_FORM+winner[i]);
        }
        System.out.println("가 최종 우승했습니다.");
    }

}