package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubstractProductAndSumOfDigitsInteger1281Test {

    SubstractProductAndSumOfDigitsInteger1281 solution = new SubstractProductAndSumOfDigitsInteger1281();

    @Test
    public void testCase1() {
        int n = 234;
        int output = 15;

        assertEquals(output, solution.subtractProductAndSum(n));
    }

    @Test
    public void testCase2() {
        int n = 4421;
        int output = 21;

        assertEquals(output, solution.subtractProductAndSum(n));
    }
}
