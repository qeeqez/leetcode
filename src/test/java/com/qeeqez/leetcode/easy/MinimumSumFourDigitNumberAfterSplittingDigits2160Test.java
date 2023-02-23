package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumSumFourDigitNumberAfterSplittingDigits2160Test {

    MinimumSumFourDigitNumberAfterSplittingDigits2160 solution = new MinimumSumFourDigitNumberAfterSplittingDigits2160();

    @Test
    public void testCase1() {
        int n = 2932;
        int output = 52;

        assertEquals(output, solution.minimumSum(n));
    }

    @Test
    public void testCase2() {
        int n = 4009;
        int output = 13;

        assertEquals(output, solution.minimumSum(n));
    }

    @Test
    public void testCase3() {
        int n = 9876;
        int output = 147;

        assertEquals(output, solution.minimumSum(n));
    }

}
