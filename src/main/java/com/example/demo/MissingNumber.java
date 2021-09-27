package com.example.demo;

public class MissingNumber {

    public static int findMissingNumber(int[] numbers) {
        int missingNumber = 1;
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
            missingNumber += i + 1 - numbers[i];
        }
        return missingNumber + numbers.length;
    }
}
