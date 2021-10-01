package com.example.demo;

import org.junit.jupiter.api.Test;


class BubbleSortTest {

    @Test
    void sortAscending() {
        int[] nums = new int[] {20, 12, 45, 19, 91, 55 };
        Utils.printIntArray("Unsorted: ", nums);
        BubbleSort.sortAscending(nums);
        Utils.printIntArray("Sorted: ", nums);

        nums = new int[] {-1, 0, 1 };
        Utils.printIntArray("Unsorted: ", nums);
        BubbleSort.sortAscending(nums);
        Utils.printIntArray("Sorted: ", nums);

        nums = new int[] {-3, -9, -2, -1 };
        Utils.printIntArray("Unsorted: ", nums);
        BubbleSort.sortAscending(nums);
        Utils.printIntArray("Sorted: ", nums);
    }

    @Test
    void sortDescending() {
        int[] nums = new int[] {20, 12, 45, 19, 91, 55 };
        Utils.printIntArray("Unsorted: ", nums);
        BubbleSort.sortDescending(nums);
        Utils.printIntArray("Sorted: ", nums);

        nums = new int[] {-1, 0, 1 };
        Utils.printIntArray("Unsorted: ", nums);
        BubbleSort.sortDescending(nums);
        Utils.printIntArray("Sorted: ", nums);

        nums = new int[] {-3, -9, -2, -1 };
        Utils.printIntArray("Unsorted: ", nums);
        BubbleSort.sortDescending(nums);
        Utils.printIntArray("Sorted: ", nums);
    }
}
