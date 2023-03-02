package com.qeeqez.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumDistanceBetweenPairOfValues1855Test {

    MaximumDistanceBetweenPairOfValues1855 solution = new MaximumDistanceBetweenPairOfValues1855();

    @Test
    public void testCase1() {
        int[] nums1 = {55, 30, 5, 4, 2};
        int[] nums2 = {100, 20, 10, 10, 5};
        int output = 2;

        assertEquals(output, solution.maxDistance(nums1, nums2));
    }

    @Test
    public void testCase2() {
        int[] nums1 = {2, 2, 2};
        int[] nums2 = {10, 10, 1};
        int output = 1;

        assertEquals(output, solution.maxDistance(nums1, nums2));
    }

    @Test
    public void testCase3() {
        int[] nums1 = {30, 29, 19, 5};
        int[] nums2 = {25, 25, 25, 25, 25};
        int output = 2;

        assertEquals(output, solution.maxDistance(nums1, nums2));
    }

    @Test
    public void testCase4() {
        int[] nums1 = {30, 29, 28, 27};
        int[] nums2 = {25, 25, 25, 25, 25};
        int output = 0;

        assertEquals(output, solution.maxDistance(nums1, nums2));
    }

}
