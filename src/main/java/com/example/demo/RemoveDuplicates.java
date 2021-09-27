package com.example.demo;

import org.apache.logging.log4j.util.Strings;

import java.util.*;

public class RemoveDuplicates {

    public static String[] removeDuplicates(String[] strings){
        if(strings.length <= 1)
            return strings;
        List<String> uniqueStrings = new ArrayList<>();
        for(int i = 0; i < strings.length; i++) {
            if(uniqueStrings.contains(strings[i])) {
                System.out.println("Dupe: [" + i + "]" + strings[i]);
                String[] dedupedStrings = removeDuplicates(Arrays.copyOfRange(strings, i + 1, strings.length));
                strings = Arrays.copyOf(strings, i + dedupedStrings.length);
                for(int j = 0; j < dedupedStrings.length; j++) {
                    System.out.println("[" + j + "]");
                    strings[j + i] = dedupedStrings[j];
                }
            } else {
                uniqueStrings.add(strings[i]);
            }
        }
        return strings;
    }

    public static Object[] removeDuplicates(Object[] objects) {
        if (objects.length <= 1)
            return Collections.emptyList().toArray();
        List<Object> uniqueObjects = new ArrayList<>();
        for (int i = 0; i < objects.length; i++) {
            if (uniqueObjects.contains(objects[i])) {
                Object[] deduped = removeDuplicates(Arrays.copyOfRange(objects, i + 1, objects.length));
                objects = Arrays.copyOf(objects, i + deduped.length);
                System.arraycopy(deduped, 0, objects, i, deduped.length);
            } else {
                uniqueObjects.add(objects[i]);
            }
        }
        return objects;
    }
}
