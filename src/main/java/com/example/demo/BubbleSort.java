package com.example.demo;

import java.util.Arrays;


/*
* Bubble sort algorithm for sorting an integer array
*/
public class BubbleSort {

    public static int[] sortAscending(int[] nums) {
        printUnsorted(nums);

        for(int i = 0; i < nums.length-1; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] > nums[j])
                    swap(nums, i, j);
            }
        }

        printSorted(nums);
        return nums;
    }

    public static int[] sortDescending(int[] nums) {
        printUnsorted(nums);

        for(int i = 0; i < nums.length-1; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] < nums[j])
                    swap(nums, i, j);
            }
        }

        printSorted(nums);
        return nums;
    }

    private static int[] swap(int[] nums, int from, int to) {
        int temp = nums[to];
        nums[to] = nums[from];
        nums[from] = temp;
        return nums;
    }

    public static void printUnsorted(int[] nums) {
        System.out.printf("Unsorted array :%s %n",
                          Arrays.toString(nums));
    }

    public static void printSorted(int[] nums) {
        System.out.printf("Sorted array :%s %n",
                          Arrays.toString(nums));
    }
}
