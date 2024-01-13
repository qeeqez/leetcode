package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveDuplicatesFromSortedArray26Test {

    RemoveDuplicatesFromSortedArray26 solution = new RemoveDuplicatesFromSortedArray26();

    @Test
    public void testCase1() {
        int[] nums = {1, 1, 2};
        int[] expectedNums = {1, 2};
        int output = 2;

        int k = solution.removeDuplicates(nums);
        assertEquals(output, k);

        for (int i = 0; i < k; i++) {
            assertEquals(nums[i], expectedNums[i]);
        }
    }

    @Test
    public void testCase2() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums = {0, 1, 2, 3, 4};
        int output = 5;

        int k = solution.removeDuplicates(nums);
        assertEquals(output, k);

        for (int i = 0; i < k; i++) {
            assertEquals(nums[i], expectedNums[i]);
        }
    }
}
