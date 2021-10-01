package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.UnaryOperator;

/*
* Merge Sort implementation.
*/
public class MergeSort {

    public static void mergeSort(int[] input) { mergeSort(input, 0, input.length-1); }

    public static void mergeSort(int[] input, int start, int end) {
        int mid = (start + end)/2;
        if(start < end) {
            mergeSort(input, start, mid);
            mergeSort(input, mid + 1, end);
        }

        int[] tmp = new int[end - start + 1];
        int first = start, last = mid + 1, i = 0;

        // USE INDICES: 'first' and 'last'
        // Common mistake: Referencing 'start' index during merging stage
        // Result: IndexOutOfBoundsException or Invalid sorting result
        while(first <= mid && last <= end) {
            tmp[i++] = input[first] < input[last] ? input[first++] : input[last++];
        }
        while(first <= mid) {
            tmp[i++] = input[first++];
        }
        while(last <= end) {
            tmp[i++] = input[last++];
        }

        i = 0;
        while(start <= end) {
            input[start++] = tmp[i++];
        }
    }

    public static List<Integer> mergeSort(List<Integer> input, Integer start, Integer end) {
        @SuppressWarnings("WrapperTypeMayBePrimitive")
        Integer mid = (start + end)/2;
        if(start < end) {
            mergeSort(input, start, mid);
            mergeSort(input, mid + 1, end);
        }

        List<Integer> temp = new ArrayList<>();
        int first = start, last = mid + 1;
        while(first <= mid && last <= end) {
            if (input.get(start) < input.get(last)) {
                temp.add(input.get(first++));
            } else {
                temp.add(input.get(last++));
            }
        }
        while(first <= mid) {
            temp.add(input.get(first++));
        }
        while(last <= end) {
            temp.add(input.get(last++));
        }

        return temp;
    }
}
