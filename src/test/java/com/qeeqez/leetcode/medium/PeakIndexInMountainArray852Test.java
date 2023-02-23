package com.qeeqez.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PeakIndexInMountainArray852Test {

    PeakIndexInMountainArray852 solution = new PeakIndexInMountainArray852();

    @Test
    public void testCase1() {
        int[] arr = {0, 1, 0};
        int output = 1;

        assertEquals(output, solution.peakIndexInMountainArray(arr));
    }

    @Test
    public void testCase2() {
        int[] arr = {0, 2, 1, 0};
        int output = 1;

        assertEquals(output, solution.peakIndexInMountainArray(arr));
    }

    @Test
    public void testCase3() {
        int[] arr = {0, 10, 5, 2};
        int output = 1;

        assertEquals(output, solution.peakIndexInMountainArray(arr));
    }
}
