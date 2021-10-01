package com.example.demo;

import java.util.Arrays;

public class CountingSort {
    /*
    * This variant counts the frequency of elements then computes the number of elements <= to each index.
    * Creating an element count array allows for stably sorting the input array in reverse order.
    * Source: https://www.baeldung.com/java-counting-sort
    * */
    public static int[] countElements(int[] input, int range) {
        int[] countArray = new int[range + 1];
        Arrays.fill(countArray, 0);

        for(int i: input) {
            if(i <= range) {
                countArray[i]++;
            } /* else throw exception: value out of range*/
        }
        for(int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i - 1];
        }

        return countArray;
    }

    public static int[] countingSort(int[] input, int range) {
        int[] sorted = new int[input.length];
        int[] countArray = countElements(input, range);

        // Preserves original order of duplicate elements
        for(int i = input.length-1; i >= 0; i--){
            int current = input[i];
            sorted[--countArray[current]] = current;
        }

        return sorted;
    }

}
