package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringIntegerConversionTest {

    @Test
    void integerToString() {
        System.out.println(StringIntegerConversion.integerToString(12345).equals("12345"));
    }

    @Test
    void stringToInt() {
        System.out.println(StringIntegerConversion.stringToInt("109876") == 109876);
    }
}