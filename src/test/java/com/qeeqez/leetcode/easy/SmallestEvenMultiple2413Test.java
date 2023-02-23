package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallestEvenMultiple2413Test {

    SmallestEvenMultiple2413 solution = new SmallestEvenMultiple2413();

    @Test
    public void testCase1() {
        int n = 5;
        int output = 10;

        assertEquals(output, solution.smallestEvenMultipleBitShift(n));
        assertEquals(output, solution.smallestEvenMultiple(n));
    }

    @Test
    public void testCase2() {
        int n = 6;
        int output = 6;

        assertEquals(output, solution.smallestEvenMultipleBitShift(n));
        assertEquals(output, solution.smallestEvenMultiple(n));
    }

}
