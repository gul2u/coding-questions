package com.example.demo;

import org.apache.logging.log4j.util.Strings;

import java.util.*;

public class RemoveDuplicates {

    // Sorted array required for "in-place" removal without additional space allocated.
    public static int[] removeDuplicates(int[] numbers) {
        MergeSort.mergeSort(numbers);

        int[] result = new int[numbers.length];
        int i = 0;
        int r = 0;
        int previous = result[r++] = numbers[i++];

        while(i < numbers.length) {
            if(previous != numbers[i]) {
                result[r++] = numbers[i];
            }
            previous = numbers[i++];
        }
        return result;
    }
}
