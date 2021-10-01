package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterCounterTest {

    @Test
    public void charCount(){
        String input = "ASCII";
        Character ch = 'I';

        System.out.println("Input: ASC1II");
        System.out.println("Char: I");
        int count = CharacterCounter.charCount(input, ch);
        System.out.println("Count: " + count);

        assertEquals(2, count);
    }

}