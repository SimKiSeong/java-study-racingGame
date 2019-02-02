package com.econo.racingGame.utils;

import java.util.Random;

public class RandomGenerator {

    static Random random = new Random();

    public static int makeRandomValue(int Bound) {
        return random.nextInt(Bound);
    }

}
