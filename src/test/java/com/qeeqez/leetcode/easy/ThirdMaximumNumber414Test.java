package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThirdMaximumNumber414Test {

    ThirdMaximumNumber414 solution = new ThirdMaximumNumber414();

    @Test
    public void testCase1() {
        int[] nums = {3, 2, 1};
        int output = 1;

        assertEquals(output, solution.thirdMax(nums));
    }

    @Test
    public void testCase2() {
        int[] nums = {1, 2};
        int output = 2;

        assertEquals(output, solution.thirdMax(nums));
    }

    @Test
    public void testCase3() {
        int[] nums = {2, 2, 3, 1};
        int output = 1;

        assertEquals(output, solution.thirdMax(nums));
    }
}
