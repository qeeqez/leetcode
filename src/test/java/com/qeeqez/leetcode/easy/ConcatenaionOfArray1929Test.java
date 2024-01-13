package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ConcatenaionOfArray1929Test {

    ConcatenaionOfArray1929 solution = new ConcatenaionOfArray1929();

    @Test
    public void testCase1() {
        int[] nums = {1, 2, 1};
        int[] output = {1, 2, 1, 1, 2, 1};

        assertArrayEquals(output, solution.getConcatenation(nums));
    }

    @Test
    public void testCase2() {
        int[] nums = {1, 3, 2, 1};
        int[] output = {1, 3, 2, 1, 1, 3, 2, 1};

        assertArrayEquals(output, solution.getConcatenation(nums));
    }

}
