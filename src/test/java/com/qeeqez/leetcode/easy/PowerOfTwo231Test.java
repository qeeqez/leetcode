package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PowerOfTwo231Test {

    PowerOfTwo231 solution = new PowerOfTwo231();

    @Test
    public void testCase1() {
        int n = 1;

        assertTrue(solution.isPowerOfTwoLoop(n));
        assertTrue(solution.isPowerOfTwo(n));
    }

    @Test
    public void testCase2() {
        int n = 16;

        assertTrue(solution.isPowerOfTwoLoop(n));
        assertTrue(solution.isPowerOfTwo(n));
    }

    @Test
    public void testCase3() {
        int n = 3;

        assertFalse(solution.isPowerOfTwoLoop(n));
        assertFalse(solution.isPowerOfTwo(n));
    }

    @Test
    public void testCase4() {
        int n = -16;

        assertFalse(solution.isPowerOfTwoLoop(n));
        assertFalse(solution.isPowerOfTwo(n));
    }
}
