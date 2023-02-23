package com.qeeqez.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindFirstLastPositionElementSortedArray34Test {

    FindFirstLastPositionElementSortedArray34 solution = new FindFirstLastPositionElementSortedArray34();

    @Test
    public void testCase1() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] output = {3, 4};

        assertArrayEquals(output, solution.searchRange(nums, target));
    }

    @Test
    public void testCase2() {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] output = {-1, -1};

        assertArrayEquals(output, solution.searchRange(nums, target));
    }

    @Test
    public void testCase3() {
        int[] nums = {};
        int target = 0;
        int[] output = {-1, -1};

        assertArrayEquals(output, solution.searchRange(nums, target));
    }

    @Test
    public void testCase4() {
        int[] nums = {1};
        int target = 1;
        int[] output = {0, 0};

        assertArrayEquals(output, solution.searchRange(nums, target));
    }

    @Test
    public void testCase5() {
        int[] nums = {8, 8, 8, 8, 8, 7};
        int target = 8;
        int[] output = {0, 4};

        assertArrayEquals(output, solution.searchRange(nums, target));
    }

    @Test
    public void testCase6() {
        int[] nums = {1, 4};
        int target = 4;
        int[] output = {1, 1};

        assertArrayEquals(output, solution.searchRange(nums, target));
    }
}
