package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSum1Test {

    TwoSum1 twoSum = new TwoSum1();

    @Test
    public void testCase1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] output = {0, 1};

        assertArrayEquals(output, twoSum.twoSum(nums, target));
    }

    @Test
    public void testCase2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] output = {1, 2};

        assertArrayEquals(output, twoSum.twoSum(nums, target));
    }

    @Test
    public void testCase3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] output = {0, 1};

        assertArrayEquals(output, twoSum.twoSum(nums, target));
    }

    @Test
    public void testCase4() {
        int[] nums = {-3, -2, -1, 0, 1, 2, 3};
        int target = -4;
        int[] expected = {0, 2};
        assertArrayEquals(expected, twoSum.twoSum(nums, target));
    }
}
