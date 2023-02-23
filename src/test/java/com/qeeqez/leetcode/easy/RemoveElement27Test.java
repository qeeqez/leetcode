package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveElement27Test {

    RemoveElement27 solution = new RemoveElement27();

    @Test
    public void testCase1() {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int[] expectedNums = {2, 2};
        int output = 2;

        int k = solution.removeElement(nums, val);
        assertEquals(output, k);

        Arrays.sort(nums, 0, k);
        for (int i = 0; i < k; i++) {
            assertEquals(nums[i], expectedNums[i]);
        }
    }

    @Test
    public void testCase2() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;

        int[] expectedNums = {0, 0, 1, 3, 4};
        int output = 5;

        int k = solution.removeElement(nums, val);
        assertEquals(output, k);

        Arrays.sort(nums, 0, k);
        for (int i = 0; i < k; i++) {
            assertEquals(nums[i], expectedNums[i]);
        }
    }
}
