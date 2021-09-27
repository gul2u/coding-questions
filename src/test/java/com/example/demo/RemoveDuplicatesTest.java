package com.example.demo;

import org.assertj.core.util.Strings;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @Test
    void removeDuplicates() {
        int[] duplicates = new int[] {20, 20, 12, 12, 12, 11, 50, 50, 8, 4, 2, 45, 45, 1, 1, 100, 19, 91, 19, 55, 55 };
        System.out.printf("Duplicates: %s %n", Arrays.toString(duplicates));
        System.out.printf("Removed Duplicates: %s %n", Arrays.toString(RemoveDuplicates.removeDuplicates(duplicates)));
    }

    @Test
    void testRemoveDuplicates() {
//        List<Integer> integers = Arrays.asList(1, 2, 5, 12, 12, 4, 2, 2, 17, 2, 1, 1, 16, 20, 10, 10);
//        List<Integer> integers = Arrays.asList(1, 1, 1, 1, 1, 1);
//        Integer[] results = integers.toArray(new Integer[integers.size()]);
//        results = (Integer[]) RemoveDuplicates.removeDuplicates(results);
//        for (Integer i: results) {
//            System.out.println(i);
//        }

    }
}