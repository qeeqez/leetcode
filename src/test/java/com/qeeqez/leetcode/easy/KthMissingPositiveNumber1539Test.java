package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthMissingPositiveNumber1539Test {

    KthMissingPositiveNumber1539 solution = new KthMissingPositiveNumber1539();

    @Test
    public void testCase1() {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        int output = 9;

        assertEquals(output, solution.findKthPositive(arr, k));
    }

    @Test
    public void testCase2() {
        int[] arr = {1, 2, 3, 4};
        int k = 2;
        int output = 6;

        assertEquals(output, solution.findKthPositive(arr, k));
    }

    @Test
    public void testCase3() {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 7;
        int output = 12;

        assertEquals(output, solution.findKthPositive(arr, k));
    }

    @Test
    public void testCase4() {
        int[] arr = {1};
        int k = 1;
        int output = 2;

        assertEquals(output, solution.findKthPositive(arr, k));
    }

    @Test
    public void testCase5() {
        int[] arr = {2};
        int k = 1;
        int output = 1;

        assertEquals(output, solution.findKthPositive(arr, k));
    }

    @Test
    public void testCase6() {
        int[] arr = {2, 3, 4};
        int k = 1;
        int output = 1;

        assertEquals(output, solution.findKthPositive(arr, k));
    }

    @Test
    public void testCase7() {
        int[] arr = {4, 5, 6};
        int k = 2;
        int output = 2;

        assertEquals(output, solution.findKthPositive(arr, k));
    }

    @Test
    public void testCase8() {
        int[] arr = {4, 6, 7};
        int k = 4;
        int output = 5;

        assertEquals(output, solution.findKthPositive(arr, k));
    }
}
