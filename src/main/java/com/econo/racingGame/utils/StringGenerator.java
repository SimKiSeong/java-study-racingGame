package com.econo.racingGame.utils;

public class StringGenerator {

    private static final String SPLIT_MARK = ",";

    public static String[] divideComma(String inputName) {
        return inputName.split(SPLIT_MARK);
    }

}
