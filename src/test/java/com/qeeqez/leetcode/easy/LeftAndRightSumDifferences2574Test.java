package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LeftAndRightSumDifferences2574Test {

    LeftAndRightSumDifferences2574 solution = new LeftAndRightSumDifferences2574();

    @Test
    public void testCase1() {
        int[] nums = {10, 4, 8, 3};
        int[] output = {15, 1, 11, 22};

        assertArrayEquals(output, solution.leftRightDifference(nums));
    }

    @Test
    public void testCase2() {
        int[] nums = {1};
        int[] output = {0};

        assertArrayEquals(output, solution.leftRightDifference(nums));
    }
}
