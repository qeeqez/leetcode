package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortedArray88Test {

    MergeSortedArray88 solution = new MergeSortedArray88();

    @Test
    public void testCase1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        int[] output = {1, 2, 2, 3, 5, 6};

        solution.merge(nums1, m, nums2, n);
        assertArrayEquals(output, nums1);
    }

    @Test
    public void testCase2() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;

        int[] output = {1};

        solution.merge(nums1, m, nums2, n);
        assertArrayEquals(output, nums1);
    }

    @Test
    public void testCase3() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;

        int[] output = {1};

        solution.merge(nums1, m, nums2, n);
        assertArrayEquals(output, nums1);
    }

    @Test
    public void testCase4() {
        int[] nums1 = {0, 0, 0};
        int m = 0;
        int[] nums2 = {1, 2, 3};
        int n = 3;

        int[] output = {1, 2, 3};

        solution.merge(nums1, m, nums2, n);
        assertArrayEquals(output, nums1);
    }
}
