package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void mergeSort() {
        int[] unsorted = new int[] {20, 12, 45, 19, 91, 55 };
        BubbleSort.printUnsorted(unsorted);
        MergeSort.mergeSort(unsorted);
        BubbleSort.printSorted(unsorted);
    }
}