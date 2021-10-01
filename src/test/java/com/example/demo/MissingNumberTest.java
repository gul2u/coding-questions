package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

    @Test
    void findMissingNumber() {
        int[] numbers = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
        int expected = 5;

        Utils.printIntArray("Numbers: ", numbers);
        int missing = MissingNumber.findMissingNumber(numbers, 10);
        System.out.println("Missing: " + missing);

        assertEquals(expected, missing);
    }

    @Test
    void findMissingNumberBitset() {
        int[] numbers = { 1, 2, 3, 4, 6, 8, 10 };
        int[] expected = { 5, 7, 9 };
        int count = 10;

        Utils.printIntArray("Numbers: ", numbers);
        System.out.println("Total Count: " + count);
        int[] missing = MissingNumber.findMissingNumberBitset(numbers, count);
        Utils.printIntArray("Missing: ", missing);

        assertNotSame(expected, missing);
        assertArrayEquals(expected, missing);
    }
}