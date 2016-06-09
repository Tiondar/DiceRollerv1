package com.example.matteo.diceroller;

import java.util.Random;

/**
 * Created by Matteo on 07/06/2016.
 */
public class Dices {

    public Dices() {
    }

    public static int dices4() {
        Random randomGenerator = new Random();
        int d4Int = randomGenerator.nextInt(4) +1;
        return d4Int;
    }

    public static int dices6() {
        Random randomGenerator = new Random();
        int d6Int = randomGenerator.nextInt(6) + 1;
        return d6Int;
    }

    public static int dices8() {
        Random randomGenerator = new Random();
        int d8Int = randomGenerator.nextInt(8) + 1;
        return d8Int;
    }

    public static int dices10() {
        Random randomGenerator = new Random();
        int d10Int = randomGenerator.nextInt(10) + 1;
        return d10Int;
    }

    public static int dices12() {
        Random randomGenerator = new Random();
        int d12Int = randomGenerator.nextInt(12) + 1;
        return d12Int;
    }

    public static int dices20() {
        Random randomGenerator = new Random();
        int d20Int = randomGenerator.nextInt(20) + 1;
        return d20Int;
    }

    public static int dices100() {
        Random randomGenerator = new Random();
        int d100Int = randomGenerator.nextInt(100) + 1;
        return d100Int;
    }

}
