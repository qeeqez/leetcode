package com.qeeqez.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSubarray53Test {

    MaximumSubarray53 solution = new MaximumSubarray53();

    @Test
    public void testCase1() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int output = 6;

        assertEquals(output, solution.maxSubArrayBruteforce(nums));
        assertEquals(output, solution.maxSubArray(nums));
    }

    @Test
    public void testCase2() {
        int[] nums = {1};
        int output = 1;

        assertEquals(output, solution.maxSubArrayBruteforce(nums));
        assertEquals(output, solution.maxSubArray(nums));
    }

    @Test
    public void testCase3() {
        int[] nums = {5, 4, -1, 7, 8};
        int output = 23;

        assertEquals(output, solution.maxSubArrayBruteforce(nums));
        assertEquals(output, solution.maxSubArray(nums));
    }

    @Test
    public void testCase4() {
        int[] nums = {1, 1, 1, 1, 1, 1, 1, 1, 1};
        int output = 9;

        assertEquals(output, solution.maxSubArrayBruteforce(nums));
        assertEquals(output, solution.maxSubArray(nums));
    }

    @Test
    public void testCase5() {
        int[] nums = {-1};
        int output = -1;

        assertEquals(output, solution.maxSubArrayBruteforce(nums));
        assertEquals(output, solution.maxSubArray(nums));
    }

    @Test
    public void testCase6() {
        int[] nums = {-2, -1};
        int output = -1;

        assertEquals(output, solution.maxSubArrayBruteforce(nums));
        assertEquals(output, solution.maxSubArray(nums));
    }

    @Test
    public void testCase7() {
        int[] nums = {1, 2, -1, -2, 2, 1, -2, 1, 4, -5, 4};
        int output = 6;

        assertEquals(output, solution.maxSubArrayBruteforce(nums));
        assertEquals(output, solution.maxSubArray(nums));
    }


}
