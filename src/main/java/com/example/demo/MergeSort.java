package com.example.demo;

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
}
