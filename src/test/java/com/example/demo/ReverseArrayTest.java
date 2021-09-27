package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReverseArrayTest {

    @Test
    void reverseArray() {
        int[] nums = new int[] { 1, 2, 3, 4, 5, 10, 20, 30, 40, 50 };
        System.out.printf("Array: %s %n", Arrays.toString(nums));
        ReverseArray.reverseArray(nums);
        System.out.printf("Reversed Array: %s %n", Arrays.toString(nums));
    }
}