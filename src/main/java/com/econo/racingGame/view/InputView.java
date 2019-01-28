package com.econo.racingGame.view;

import java.util.Scanner;

public class InputView {

    private static final String SPLIT_MARK = ",";

    public static String[] carNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요.");
        String inputName = scanner.next();
        return divideDriver(inputName);
    }

    public static int tryNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("시도할 회수는 몇대인가요?");
        int tryNumber = scanner.nextInt();
        return tryNumber;
    }

    public static String[] divideDriver(String inputName) {
        return inputName.split(SPLIT_MARK);
    }

}