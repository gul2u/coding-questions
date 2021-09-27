package com.example.demo;

public class CharacterCounter {

    public static int charCount(String str, Character ch) {
        int charCount = 0;
        for(char c: str.toCharArray()) {
            if(c == ch)
                charCount++;
        }
        return charCount;
    }
}
