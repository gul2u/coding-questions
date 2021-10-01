package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void mergeSort() {
        int[] unsorted = new int[] {20, 12, 45, 19, 91, 55 };
        Utils.printIntArray("Unsorted: ", unsorted);
        MergeSort.mergeSort(unsorted);
        Utils.printIntArray("Sorted: ", unsorted);
    }

    @Test
    void mergeSortList() {
        List<Integer> numbers = Arrays.asList(20, 12, 45, 19, 91, 55);
        Utils.printArray("Unsorted: ", numbers.toArray());
        List<Integer> sorted = MergeSort.mergeSort(numbers, 0, numbers.size() - 1);
        Utils.printArray("Sorted: ", numbers.toArray());
    }
}