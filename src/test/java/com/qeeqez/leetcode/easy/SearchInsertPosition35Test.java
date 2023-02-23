package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInsertPosition35Test {

    SearchInsertPosition35 solution = new SearchInsertPosition35();

    @Test
    public void testCase1() {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int output = 2;

        assertEquals(output, solution.searchInsert(nums, target));
    }

    @Test
    public void testCase2() {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int output = 1;

        assertEquals(output, solution.searchInsert(nums, target));
    }

    @Test
    public void testCase3() {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int output = 4;

        assertEquals(output, solution.searchInsert(nums, target));
    }

    @Test
    public void testCase4() {
        int[] nums = {1};
        int target = 1;
        int output = 0;

        assertEquals(output, solution.searchInsert(nums, target));
    }

    @Test
    public void testCase5() {
        int[] nums = {1};
        int target = 2;
        int output = 1;

        assertEquals(output, solution.searchInsert(nums, target));
    }

    @Test
    public void testCase6() {
        int[] nums = {1};
        int target = 0;
        int output = 0;

        assertEquals(output, solution.searchInsert(nums, target));
    }

    @Test
    public void testCase7() {
        int[] nums = {11, 22, 33, 44, 55, 66, 77};
        int target = 49;
        int output = 4;

        assertEquals(output, solution.searchInsert(nums, target));
    }
}
