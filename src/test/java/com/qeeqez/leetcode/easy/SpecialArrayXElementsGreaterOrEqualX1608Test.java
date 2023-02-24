package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpecialArrayXElementsGreaterOrEqualX1608Test {

    SpecialArrayXElementsGreaterOrEqualX1608 solution = new SpecialArrayXElementsGreaterOrEqualX1608();

    @Test
    public void testCase1() {
        int[] nums = {3, 5};
        int output = 2;

        assertEquals(output, solution.specialArraySlow(nums));
        assertEquals(output, solution.specialArray(nums));
    }

    @Test
    public void testCase2() {
        int[] nums = {0, 0};
        int output = -1;

        assertEquals(output, solution.specialArraySlow(nums));
        assertEquals(output, solution.specialArray(nums));
    }

    @Test
    public void testCase3() {
        int[] nums = {0, 4, 3, 0, 4};
        int output = 3;

        assertEquals(output, solution.specialArraySlow(nums));
        assertEquals(output, solution.specialArray(nums));
    }

    @Test
    public void testCase4() {
        int[] nums = {0, 4, 4, 0, 4};
        int output = 3;

        assertEquals(output, solution.specialArraySlow(nums));
        assertEquals(output, solution.specialArray(nums));
    }

    @Test
    public void testCase5() {
        int[] nums = {0, 4, 4, 0, 4, 5};
        int output = 4;

        assertEquals(output, solution.specialArraySlow(nums));
        assertEquals(output, solution.specialArray(nums));
    }

    @Test
    public void testCase6() {
        int[] nums = {0, 4, 3, 0, 4, 5};
        int output = -1;

        assertEquals(output, solution.specialArraySlow(nums));
        assertEquals(output, solution.specialArray(nums));
    }

    @Test
    public void testCase7() {
        int[] nums = {0, 4, 3, 0, 4, 5, 6};
        int output = 4;

        assertEquals(output, solution.specialArraySlow(nums));
        assertEquals(output, solution.specialArray(nums));
    }
}
