package com.example.demo;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 *   Problem: Print the first non-repeated character from a string
 *   Context: Write a function that takes in a String and returns the first
 *   non-repeated character.
 *   Examples:
 *       1. All characters in the word "hello", except 'l' are non-repeated, but 'h' is the first non-repeated character.
 *       2. 'w' is the first non-repeated character in the word "swiss".
 * */
public class FirstNonrepeatedCharacter {
    
    public FirstNonrepeatedCharacter(){}
    public Character findChar(String chars) {
        LinkedHashMap<Character, Integer> charCount = countChars(chars);
        return charCount.entrySet()
                       .stream()
                       .filter(e -> e.getValue() == 1)
                       .findFirst()
                       .map(Map.Entry::getKey).orElse(null);
    }
    
    public LinkedHashMap<Character, Integer> countChars(String chars) {
        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();

        for(Character ch: chars.toCharArray()) {
            Integer count = charCount.get(ch);
            if(count == null)
                charCount.put(ch, 1);
            else
                charCount.put(ch, ++count);
        }
        return charCount;
    }
}
