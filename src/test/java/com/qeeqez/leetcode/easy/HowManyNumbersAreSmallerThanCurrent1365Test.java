package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HowManyNumbersAreSmallerThanCurrent1365Test {

    HowManyNumbersAreSmallerThanCurrent1365 solution = new HowManyNumbersAreSmallerThanCurrent1365();

    @Test
    public void testCase1() {
        int[] nums = {8, 1, 2, 2, 3};
        int[] output = {4, 0, 1, 1, 3};

        assertArrayEquals(output, solution.smallerNumbersThanCurrent(nums));
    }

    @Test
    public void testCase2() {
        int[] nums = {6, 5, 4, 8};
        int[] output = {2, 1, 0, 3};

        assertArrayEquals(output, solution.smallerNumbersThanCurrent(nums));
    }

    @Test
    public void testCase3() {
        int[] nums = {7, 7, 7, 7};
        int[] output = {0, 0, 0, 0};

        assertArrayEquals(output, solution.smallerNumbersThanCurrent(nums));
    }
}
