package com.example.demo;

import java.util.*;

public class ReverseArray {

    public static Integer[] reverseArray(Integer[] integers) {
        List<Integer> reversedArray = new ArrayList<>();
        Stack<Integer> integerStack = new Stack<>();

        for(Integer i: integers) {
            integerStack.push(i);
        }
        while(!integerStack.isEmpty()) {
            reversedArray.add(integerStack.pop());
        }

        return reversedArray.toArray(integers);
    }

//    public static Object[] reverseArray(Object[] objects) {
//        Object[] reversedArray = new Object[objects.length];
//
//        for(int i = 0; i < objects.length; i++) {
//            reversedArray[objects.length-1 - i] = objects[i];
//        }
//
//        return Arrays.copyOf(reversedArray, reversedArray.length);
//    }
}
