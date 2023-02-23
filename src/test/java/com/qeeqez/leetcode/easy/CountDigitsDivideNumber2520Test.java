package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountDigitsDivideNumber2520Test {

    CountDigitsDivideNumber2520 solution = new CountDigitsDivideNumber2520();

    @Test
    public void testCase1() {
        int num = 7;
        int output = 1;

        assertEquals(output, solution.countDigits(num));
    }

    @Test
    public void testCase2() {
        int num = 121;
        int output = 2;

        assertEquals(output, solution.countDigits(num));
    }

    @Test
    public void testCase3() {
        int num = 1248;
        int output = 4;

        assertEquals(output, solution.countDigits(num));
    }
}
