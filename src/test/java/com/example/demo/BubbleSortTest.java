package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void sortAscending() {
        int[] input = { 20, 12, 45, 19, 91, 55 };
        Utils.printIntArray("Unsorted: ", input);
        BubbleSort.sortAscending(input);
        int[] sorted = Arrays.copyOf(input, input.length);
        Utils.printIntArray("Sorted: ", sorted);

        Arrays.sort(input);
        assertArrayEquals(input, sorted);

        input = new int[] {-1, 1, 0 };
        Utils.printIntArray("Unsorted: ", input);
        BubbleSort.sortAscending(input);
        sorted = Arrays.copyOf(input, input.length);
        Utils.printIntArray("Sorted: ", sorted);

        Arrays.sort(input);
        assertArrayEquals(input, sorted);

        input = new int[] {-3, -9, -2, -1 };
        Utils.printIntArray("Unsorted: ", input);
        BubbleSort.sortAscending(input);
        sorted = Arrays.copyOf(input, input.length);
        Utils.printIntArray("Sorted: ", sorted);

        Arrays.sort(input);
        assertArrayEquals(input, sorted);
    }

    @Test
    void sortDescending() {
        int[] input = { 20, 12, 45, 19, 91, 55 };
        Utils.printIntArray("Unsorted: ", input);
        BubbleSort.sortDescending(input);
        int[] sorted = input;
        Utils.printIntArray("Sorted(Desc): ", sorted);

        int[] expected = Arrays.stream(input)
                                .boxed()
                                .sorted(Collections.reverseOrder())
                                .mapToInt(Integer::intValue)
                                .toArray();
        assertArrayEquals(expected, sorted);

        input = new int[] {-1, 0, 1 };
        Utils.printIntArray("Unsorted: ", input);
        BubbleSort.sortDescending(input);
        sorted = input;
        Utils.printIntArray("Sorted(Desc): ", sorted);

        expected = Arrays.stream(input)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        assertArrayEquals(expected, sorted);

        input = new int[] {-3, -9, -2, -1 };
        Utils.printIntArray("Unsorted: ", input);
        BubbleSort.sortDescending(input);
        sorted = input;
        Utils.printIntArray("Sorted(Desc): ", sorted);

        expected = Arrays.stream(input)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        assertArrayEquals(expected, sorted);
    }
}
