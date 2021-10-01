package com.example.demo;

import java.util.Arrays;


/*
* Bubble sort algorithm for sorting an integer array
*/
public class BubbleSort {

    public static void sortAscending(int[] nums) {
        for(int i = 0; i < nums.length-1; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] > nums[j])
                    swap(nums, i, j);
            }
        }
    }

    public static void sortDescending(int[] nums) {
        for(int i = 0; i < nums.length-1; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] < nums[j])
                    swap(nums, i, j);
            }
        }
    }

    private static void swap(int[] nums, int from, int to) {
        int temp = nums[to];
        nums[to] = nums[from];
        nums[from] = temp;
    }

}
