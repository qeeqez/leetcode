package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ConcantenationOfArray1929Test {

    ConcatentaionOfArray1929 solution = new ConcatentaionOfArray1929();

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
