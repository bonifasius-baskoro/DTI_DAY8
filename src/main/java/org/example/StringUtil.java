package org.example;


import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class StringUtil {

    public static String generateName() {
        Random newRand = new Random();
        int randomInt = newRand.nextInt(1,12);
        return RandomStringUtils.randomAlphabetic(randomInt);
    }
}
