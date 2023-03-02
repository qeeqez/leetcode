package com.qeeqez.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInRotatedSortedArray33Test {

    SearchInRotatedSortedArray33 solution = new SearchInRotatedSortedArray33();

    @Test
    public void testCaseRotatedExist() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int output = 4;

        assertEquals(output, solution.search(nums, target));
    }

    @Test
    public void testCaseRotatedNotExist() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        int output = -1;

        assertEquals(output, solution.search(nums, target));
    }

    @Test
    public void testCaseSingleExist() {
        int[] nums = {1};
        int target = 1;
        int output = 0;

        assertEquals(output, solution.search(nums, target));
    }

    @Test
    public void testCaseSingleNotExist() {
        int[] nums = {1};
        int target = 0;
        int output = -1;

        assertEquals(output, solution.search(nums, target));
    }

    @Test
    public void testCaseTwoExist() {
        int[] nums = {1, 3};
        int target = 3;
        int output = 1;

        assertEquals(output, solution.search(nums, target));
    }

    @Test
    public void testCaseTwoNotExist() {
        int[] nums = {1, 3};
        int target = 0;
        int output = -1;

        assertEquals(output, solution.search(nums, target));
    }

    @Test
    public void testCaseThreeExist() {
        int[] nums = {1, 2, 3};
        int target = 3;
        int output = 2;

        assertEquals(output, solution.search(nums, target));
    }

    @Test
    public void testCaseThreeNotExist() {
        int[] nums = {1, 2, 3};
        int target = 0;
        int output = -1;

        assertEquals(output, solution.search(nums, target));
    }

    @Test
    public void testCaseNonRotatedExist() {
        int[] nums = {0, 1, 2, 4, 5, 6, 7};
        int target = 1;
        int output = 1;

        assertEquals(output, solution.search(nums, target));
    }

    @Test
    public void testCaseNonRotatedNotExist() {
        int[] nums = {0, 1, 2, 4, 5, 6, 7};
        int target = 50;
        int output = -1;

        assertEquals(output, solution.search(nums, target));
    }

    @Test
    public void testCaseRotatedLargeLeftExist() {
        int[] nums = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 0, 1, 2};
        int target = 7;
        int output = 3;

        assertEquals(output, solution.search(nums, target));
    }

    @Test
    public void testCaseRotatedLargeRightExist() {
        int[] nums = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 0, 1, 2};
        int target = 0;
        int output = 17;

        assertEquals(output, solution.search(nums, target));
    }

    @Test
    public void testCaseRotatedRightExist1() {
        int[] nums = {5, 1, 2, 3, 4};
        int target = 1;
        int output = 1;

        assertEquals(output, solution.search(nums, target));
    }

    @Test
    public void testCaseRotatedRightExist3() {
        int[] nums = {5, 1, 2, 3, 4};
        int target = 3;
        int output = 3;

        assertEquals(output, solution.search(nums, target));
    }

    @Test
    public void testCaseRotatedNotExist0() {
        int[] nums = {5, 1, 2, 3, 4};
        int target = 0;
        int output = -1;

        assertEquals(output, solution.search(nums, target));
    }
}
