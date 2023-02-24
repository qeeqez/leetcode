package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NextGreaterElementI496Test {

    NextGreaterElementI496 solution = new NextGreaterElementI496();

    @Test
    public void testCase1() {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] output = {-1, 3, -1};

        assertArrayEquals(output, solution.nextGreaterElementBruteForce(nums1, nums2));
        assertArrayEquals(output, solution.nextGreaterElement(nums1, nums2));
    }

    @Test
    public void testCase2() {
        int[] nums1 = {2, 4};
        int[] nums2 = {1, 2, 3, 4};
        int[] output = {3, -1};

        assertArrayEquals(output, solution.nextGreaterElementBruteForce(nums1, nums2));
        assertArrayEquals(output, solution.nextGreaterElement(nums1, nums2));
    }

}
