package com.example.demo;

import javax.swing.*;
import java.util.*;


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

    public Character findCharLinkedHashMap(String chars) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for(Character ch: chars.toCharArray()) {
            Integer count = charCount.getOrDefault(ch, 0);
            charCount.put(ch, ++count);
        }

        return charCount.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey).orElse(null);
    }


    public Character findCharSetList(String chars) {
        Set<Character> repeating = new HashSet<>();
        List<Character> nonRepeating = new ArrayList<>();

        for(Character ch: chars.toCharArray()) {
            if(!repeating.contains(ch)) {
                if(nonRepeating.contains(ch)) {
                    repeating.add(ch);
                    nonRepeating.remove(ch);
                } else {
                    nonRepeating.add(ch);
                }
            }
        }

        return nonRepeating.get(0);
    }

    public Character findCharTraverseHashMap(String chars) {
        Map<Character, Integer> charCount = new HashMap<>();
        for(Character ch: chars.toCharArray()) {
            Integer count = charCount.getOrDefault(ch,0);
            charCount.put(ch, ++count);
        }

        for(Character ch: chars.toCharArray()) {
            if(charCount.get(ch) == 1)
                return ch;
        }

        return null;
    }
}
