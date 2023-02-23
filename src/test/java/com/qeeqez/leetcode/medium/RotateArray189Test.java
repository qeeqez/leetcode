package com.qeeqez.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RotateArray189Test {

    RotateArray189 solution = new RotateArray189();

    @Test
    public void testCase1() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int[] output = {5, 6, 7, 1, 2, 3, 4};

        solution.rotate(nums, k);
        assertArrayEquals(output, nums);
    }

    @Test
    public void testCase2() {
        int[] nums = {-1, -100, 3, 99};
        int k = 2;
        int[] output = {3, 99, -1, -100};

        solution.rotate(nums, k);
        assertArrayEquals(output, nums);
    }

    @Test
    public void testCase3() {
        int[] nums = {1, 2};
        int k = 3;
        int[] output = {2, 1};

        solution.rotate(nums, k);
        assertArrayEquals(output, nums);
    }

}
