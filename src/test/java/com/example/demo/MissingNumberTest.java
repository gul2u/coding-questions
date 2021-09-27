package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

    @Test
    void findMissingNumber() {
        int[] numbers = new int[] { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
        System.out.println(MissingNumber.findMissingNumber(numbers, 10));
    }

    @Test
    void findMissingNumberBitset() {
        int[] numbers = new int[] { 1, 2, 3, 4, 6, 8, 10 };
        MissingNumber.findMissingNumberBitset(numbers, 10);
    }
}