package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CountingSortTest {

    @Test
    void countingSort() {
        int[] input = { 20, 12, 4, 19, 1, 5, 10, 3, 2, 4, 2, 5, 5, 14, 18, 17, 16, 20, 3, 0, 12 };
        int range = 20;

        Utils.printIntArray("Unsorted: ", input);
        System.out.println("Range: " + range);
        int[] sorted = CountingSort.countingSort(input, range);
        Utils.printIntArray("Sorted: ", sorted);

        Arrays.sort(input);
        assertNotSame(input, sorted);
        assertArrayEquals(input, sorted);
    }

    @Test
    void countElements() {
        int[] input = { 0, 2, 4, 1, 1, 5, 10, 3 };
        int range = 10;

        int[] countArray = CountingSort.countElements(input, range);
        int[] expected = { 1, 3, 4, 5, 6, 7, 7, 7, 7, 7, 8 };

        Utils.printIntArray("Input: ", input);
        System.out.println("Range: " + range);
        Utils.printIntArray("Expected: ", expected);

        assertNotSame(expected, countArray);
        assertArrayEquals(expected, countArray);
    }
}