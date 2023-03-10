package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMiddleIndexInArray1991Test {

    FindMiddleIndexInArray1991 solution = new FindMiddleIndexInArray1991();

    @Test
    public void testCase1() {
        int[] nums = {1, 7, 3, 6, 5, 6};
        int output = 3;

        assertEquals(output, solution.findMiddleIndex(nums));
    }

    @Test
    public void testCase2() {
        int[] nums = {1, 2, 3};
        int output = -1;

        assertEquals(output, solution.findMiddleIndex(nums));
    }

    @Test
    public void testCase3() {
        int[] nums = {2, 1, -1};
        int output = 0;

        assertEquals(output, solution.findMiddleIndex(nums));
    }

    @Test
    public void testCase4() {
        int[] nums = {1, -1, 2};
        int output = 2;

        assertEquals(output, solution.findMiddleIndex(nums));
    }

    @Test
    public void testCase5() {
        int[] nums = {2, 3, -1, 8, 4};
        int output = 3;

        assertEquals(output, solution.findMiddleIndex(nums));
    }

    @Test
    public void testCase6() {
        int[] nums = {1, -1, 4};
        int output = 2;

        assertEquals(output, solution.findMiddleIndex(nums));
    }

    @Test
    public void testCase7() {
        int[] nums = {2, 5};
        int output = -1;

        assertEquals(output, solution.findMiddleIndex(nums));
    }

}
