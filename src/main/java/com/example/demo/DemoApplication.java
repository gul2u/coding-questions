package com.example.demo;

import org.apache.logging.log4j.util.Strings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.security.spec.MGF1ParameterSpec;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;


@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);

        String chars = "swiss";
        Character ch = findFirstUniqueChar(chars);
        if (ch != null){
            System.out.println(ch);
        } else {
            System.out.println("Non-repeated character not found in: " + chars);
        }

    }

    public static Character findFirstUniqueChar(String chars) {
        LinkedHashMap<Character, Integer> charCount = countChars(chars);
        for (Map.Entry<Character, Integer> e : charCount.entrySet())
            if (e.getValue() == 1) { return e.getKey(); }

        return null;
    }

    public static LinkedHashMap<Character, Integer> countChars(String chars) {
        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();

        for(Character ch: chars.toCharArray()) {
            Integer count = charCount.get(ch);
            if(count == null) {
                charCount.put(ch, 1);
            } else {
                charCount.put(ch, ++count);
            }
        }

        return charCount;
    }
}


