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

    public static void reverseArray(int[] input) {
        int tmp;
        for(int i = 0; i < input.length/2; i++) {
            tmp = input[i];
            input[i] = input[input.length-1 - i];
            input[input.length-1 - i] = tmp;
        }
    }

}
