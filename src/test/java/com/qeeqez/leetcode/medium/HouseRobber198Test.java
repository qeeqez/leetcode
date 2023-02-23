package com.qeeqez.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HouseRobber198Test {

    HouseRobber198 solution = new HouseRobber198();

    @Test
    public void testCase1() {
        int[] nums = {1, 2, 3, 1};
        int output = 4;

        assertEquals(output, solution.rob(nums));
    }

    @Test
    public void testCase2() {
        int[] nums = {2, 7, 9, 3, 1};
        int output = 12;

        assertEquals(output, solution.rob(nums));
    }

    @Test
    public void testCase3() {
        int[] nums = {2, 7, 9, 6, 1};
        int output = 13;

        assertEquals(output, solution.rob(nums));
    }

    @Test
    public void testCase4() {
        int[] nums = {2, 1, 1, 2};
        int output = 4;

        assertEquals(output, solution.rob(nums));
    }

}
