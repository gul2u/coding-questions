package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicatesTest {

    @Test
    void removeDuplicates() {
        int[] duplicates = { 20, 20, 12, 12, 12, 11, 50, 50, 8, 4, 2, 45, 45, 1, 1, 100, 19, 91, 19, 55, 55 };
        int[] expected = { 1, 2, 4, 8, 11, 12, 19, 20, 45, 50, 55, 91, 100, 0, 0, 0, 0, 0, 0, 0, 0 };

        Utils.printIntArray("Input: ", duplicates);
        int[] deduped = RemoveDuplicates.removeDuplicates(duplicates);
        Utils.printIntArray("Deduped: ", deduped);

        assertArrayEquals(expected, deduped);
    }
}