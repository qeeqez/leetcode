package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearch704Test {

    BinarySearch704 solution = new BinarySearch704();

    @Test
    public void testCase1() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int output = 4;

        assertEquals(output, solution.search(nums, target));
    }

    @Test
    public void testCase2() {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 2;
        int output = -1;

        assertEquals(output, solution.search(nums, target));
    }

    @Test
    public void testCase3() {
        int[] nums = {-1, 0, 3, 5, 9, 12, 18};
        int target = 0;
        int output = 1;

        assertEquals(output, solution.search(nums, target));
    }

    @Test
    public void testCase4() {
        int[] nums = {10};
        int target = 12;
        int output = -1;

        assertEquals(output, solution.search(nums, target));
    }

    @Test
    public void testCase5() {
        int[] nums = {10};
        int target = 10;
        int output = 0;

        assertEquals(output, solution.search(nums, target));
    }

    @Test
    public void testCase6() {
        int[] nums = {1, 2};
        int target = 1;
        int output = 0;

        assertEquals(output, solution.search(nums, target));
    }

    @Test
    public void testCase7() {
        int[] nums = {1, 2, 3};
        int target = 1;
        int output = 0;

        assertEquals(output, solution.search(nums, target));
    }

}
