package com.example.demo;

import org.springframework.util.StringUtils;

public class CharacterCounter {

    public static int charCount(String str, Character ch) {
        int charCount = 0;
        for(char c: str.toCharArray()) {
            if(c == ch)
                charCount++;
        }
        return charCount;
    }

    public static int charCountStringUtils(String str, Character ch) {
        return StringUtils.countOccurrencesOf(str, ch.toString());
    }
}
