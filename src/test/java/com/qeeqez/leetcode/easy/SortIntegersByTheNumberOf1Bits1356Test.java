package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortIntegersByTheNumberOf1Bits1356Test {

    SortIntegersByTheNumberOf1Bits1356 solution = new SortIntegersByTheNumberOf1Bits1356();

    @Test
    public void testCase1() {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] output = {0, 1, 2, 4, 8, 3, 5, 6, 7};

        assertArrayEquals(output, solution.sortByBits(arr));
    }

    @Test
    public void testCase2() {
        int[] arr = {1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
        int[] output = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

        assertArrayEquals(output, solution.sortByBits(arr));
    }

}
