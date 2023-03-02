package com.qeeqez.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMinimumInRotatedSortedArray153Test {

    FindMinimumInRotatedSortedArray153 solution = new FindMinimumInRotatedSortedArray153();

    @Test
    public void testCase1() {
        int[] nums = {3, 4, 5, 1, 2};
        int output = 1;

        assertEquals(output, solution.findMin(nums));
    }

    @Test
    public void testCase2() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int output = 0;

        assertEquals(output, solution.findMin(nums));
    }

    @Test
    public void testCase3() {
        int[] nums = {11, 13, 15, 17};
        int output = 11;

        assertEquals(output, solution.findMin(nums));
    }

    @Test
    public void testCase4() {
        int[] nums = {5, 0, 1, 2, 3, 4};
        int output = 0;

        assertEquals(output, solution.findMin(nums));
    }

    @Test
    public void testCase5() {
        int[] nums = {3, 1, 2};
        int output = 1;

        assertEquals(output, solution.findMin(nums));
    }
}
