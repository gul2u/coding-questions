package com.example.demo;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void mergeSort() {
        int[] input = { 20, 12, 45, 19, 91, 55 };
        int[] expected = { 20, 12, 45, 19, 91, 55 };
        Arrays.sort(expected);

        Utils.printIntArray("Unsorted: ", input);
        MergeSort.mergeSort(input);
        Utils.printIntArray("Sorted: ", input);

        assertNotSame(expected, input);
        assertArrayEquals(expected, input);
    }

    @Test
    void mergeSortList() {
        List<Integer> input = Arrays.asList(20, 12, 45, 19, 91, 55);
        List<Integer> expected = Arrays.asList(20, 12, 45, 19, 91, 55);
        Collections.sort(expected);

        Utils.printArray("Unsorted: ", input.toArray());
        MergeSort.mergeSort(input, 0, input.size() - 1);
        Utils.printArray("Sorted: ", input.toArray());

        assertNotSame(expected, input);
        assertEquals(expected, input);
    }
}