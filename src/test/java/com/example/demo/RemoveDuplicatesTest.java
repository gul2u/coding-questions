package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class RemoveDuplicatesTest {

    @Test
    void removeDuplicates() {
        int[] duplicates = new int[] {20, 20, 12, 12, 12, 11, 50, 50, 8, 4, 2, 45, 45, 1, 1, 100, 19, 91, 19, 55, 55 };
        Object[] dupes = Arrays.stream(duplicates)
                                .boxed()
                                .toArray();
        Utils.printArray("Duplicates: ", dupes);
        dupes = Arrays.stream(RemoveDuplicates.removeDuplicates(duplicates))
                        .boxed()
                        .toArray();
        Utils.printArray("Removed Duplicates: ", dupes);
    }
}