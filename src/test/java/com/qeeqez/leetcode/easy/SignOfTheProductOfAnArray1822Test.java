package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SignOfTheProductOfAnArray1822Test {

    SignOfTheProductOfAnArray1822 solution = new SignOfTheProductOfAnArray1822();

    @Test
    public void testCase1() {
        int[] nums = {-1, -2, -3, -4, 3, 2, 1};
        int output = 1;

        assertEquals(output, solution.arraySign(nums));
    }

    @Test
    public void testCase2() {
        int[] nums = {1, 5, 0, 2, -3};
        int output = 0;

        assertEquals(output, solution.arraySign(nums));
    }

    @Test
    public void testCase3() {
        int[] nums = {-1, 1, -1, 1, -1};
        int output = -1;

        assertEquals(output, solution.arraySign(nums));
    }
}
