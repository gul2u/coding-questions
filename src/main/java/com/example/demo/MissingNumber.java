package com.example.demo;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumber {

    public static int findMissingNumber(int[] numbers, int totalCount) {
        int expectedSum = (totalCount * totalCount + totalCount)/2;
        int sum = 0;
        for(int num: numbers) {
            sum += num;
        }
        return expectedSum - sum;
    }

    public static int[] findMissingNumberBitset(int[] numbers, int totalCount) {
        int missing = totalCount - numbers.length;
        BitSet bitSet = new BitSet(totalCount);

        for(int num: numbers) {
            bitSet.set(num - 1);
        }

        int[] missingNumbers = new int[missing];
        int lastMissingIndex = 0;
        for(int i = 0; i < missing; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            missingNumbers[i] = ++lastMissingIndex;
        }

        return missingNumbers;
    }
}
