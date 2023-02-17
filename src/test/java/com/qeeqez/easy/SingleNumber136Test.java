package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumber136Test {

    SingleNumber136 solution = new SingleNumber136();

    @Test
    public void testCase1() {
        int[] nums = {2, 2, 1};
        int output = 1;

        assertEquals(output, solution.singleNumberSlow(nums));
        assertEquals(output, solution.singleNumber(nums));
    }

    @Test
    public void testCase2() {
        int[] nums = {4, 1, 2, 1, 2};
        int output = 4;

        assertEquals(output, solution.singleNumberSlow(nums));
        assertEquals(output, solution.singleNumber(nums));
    }

    @Test
    public void testCase3() {
        int[] nums = {1};
        int output = 1;

        assertEquals(output, solution.singleNumberSlow(nums));
        assertEquals(output, solution.singleNumber(nums));
    }

    @Test
    public void testCase4() {
        int[] nums = {1, 1, 0};
        int output = 0;

        assertEquals(output, solution.singleNumberSlow(nums));
        assertEquals(output, solution.singleNumber(nums));
    }

    @Test
    public void testCase5() {
        int[] nums = {1, 0, 1, 0, -77};
        int output = -77;

        assertEquals(output, solution.singleNumberSlow(nums));
        assertEquals(output, solution.singleNumber(nums));
    }

    @Test
    public void testCase6() {
        int[] nums = {1, 0, 1, 0, -10000, 10000, -10000};
        int output = 10000;

        assertEquals(output, solution.singleNumberSlow(nums));
        assertEquals(output, solution.singleNumber(nums));
    }

    @Test
    public void testCase7() {
        int[] nums = {1, 0, 1, 0, -10000, 15888, 10000, -10000, 10000};
        int output = 15888;

        assertEquals(output, solution.singleNumberSlow(nums));
        assertEquals(output, solution.singleNumber(nums));
    }

}
