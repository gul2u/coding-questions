package com.example.demo;

import java.util.Arrays;

public class Utils {

    public static <T> void printArray(String msg, T[] input) {
        System.out.printf(msg + "%s %n", Arrays.toString(input));
    }

    public static void printIntArray(String msg, int[] input) {
        Object[] boxedInput = Arrays.stream(input)
                                        .boxed()
                                        .toArray();
        printArray(msg, boxedInput);
    }
}
