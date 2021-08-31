package com.example.demo;

import org.junit.jupiter.api.Test;


class BubbleSortTest {

    @Test
    void sortAscending() {
        BubbleSort.sortAscending(new int[] {20, 12, 45, 19, 91, 55 });
        BubbleSort.sortAscending(new int[] {-1, 0, 1 });
        BubbleSort.sortAscending(new int[] {-3, -9, -2, -1 });
    }

    @Test
    void sortDescending() {
        BubbleSort.sortDescending(new int[] {20, 12, 45, 19, 91, 55 });
        BubbleSort.sortDescending(new int[] {-1, 0, 1 });
        BubbleSort.sortDescending(new int[] {-3, -9, -2, -1 });
    }
}
