package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayTest {

    @Test
    void reverseArray() {
        int[] input = { 1, 2, 3, 4, 5, 10, 20, 30, 40, 50 };
        int[] expected = Arrays.stream(input)
                                    .boxed()
                                    .sorted(Collections.reverseOrder())
                                    .mapToInt(Integer::intValue)
                                    .toArray();

        Utils.printIntArray("Input: ", input);
        ReverseArray.reverseArray(input);
        Utils.printIntArray("Reversed Array: ", input);

        assertNotSame(expected, input);
        assertArrayEquals(expected, input);
    }
}