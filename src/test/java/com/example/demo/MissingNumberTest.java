package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

    @Test
    void findMissingNumber() {
        int[] numbers = new int[9];
        for(int i = 8; i > 1; i--) {
            numbers[i] = i + 2;
        }
        System.out.println(MissingNumber.findMissingNumber(numbers));
    }
}