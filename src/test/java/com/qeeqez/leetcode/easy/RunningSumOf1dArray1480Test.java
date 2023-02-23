package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RunningSumOf1dArray1480Test {

    RunningSumOf1dArray1480 solution = new RunningSumOf1dArray1480();

    @Test
    public void testCase1() {
        int[] nums = {1, 2, 3, 4};
        int[] output = {1, 3, 6, 10};

        assertArrayEquals(output, solution.runningSum(nums));
    }

    @Test
    public void testCase2() {
        int[] nums = {1, 1, 1, 1, 1};
        int[] output = {1, 2, 3, 4, 5};

        assertArrayEquals(output, solution.runningSum(nums));
    }

    @Test
    public void testCase3() {
        int[] nums = {3, 1, 2, 10, 1};
        int[] output = {3, 4, 6, 16, 17};

        assertArrayEquals(output, solution.runningSum(nums));
    }
}
