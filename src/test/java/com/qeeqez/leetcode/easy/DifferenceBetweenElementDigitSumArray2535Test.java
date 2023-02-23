package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DifferenceBetweenElementDigitSumArray2535Test {

    DifferenceBetweenElementDigitSumArray2535 solution = new DifferenceBetweenElementDigitSumArray2535();

    @Test
    public void testCase1() {
        int[] nums = {1, 15, 6, 3};
        int output = 9;

        assertEquals(output, solution.differenceOfSum(nums));
    }

    @Test
    public void testCase2() {
        int[] nums = {1, 2, 3, 4};
        int output = 0;

        assertEquals(output, solution.differenceOfSum(nums));
    }
}