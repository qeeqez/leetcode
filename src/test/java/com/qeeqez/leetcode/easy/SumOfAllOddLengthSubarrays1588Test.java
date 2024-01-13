package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfAllOddLengthSubarrays1588Test {

    SumOfAllOddLengthSubarrays1588 solution = new SumOfAllOddLengthSubarrays1588();

    @Test
    public void testCase1() {
        int[] arr = {1, 4, 2, 5, 3};
        int output = 58;

        assertEquals(output, solution.sumOddLengthSubarraysBruteForce(arr));
        assertEquals(output, solution.sumOddLengthSubarrays(arr));
    }

    @Test
    public void testCase2() {
        int[] arr = {1, 2};
        int output = 3;

        assertEquals(output, solution.sumOddLengthSubarraysBruteForce(arr));
        assertEquals(output, solution.sumOddLengthSubarrays(arr));
    }

    @Test
    public void testCase3() {
        int[] arr = {10, 11, 12};
        int output = 66;

        assertEquals(output, solution.sumOddLengthSubarraysBruteForce(arr));
        assertEquals(output, solution.sumOddLengthSubarrays(arr));
    }

}
