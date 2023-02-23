package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidPerfectSquare367Test {

    ValidPerfectSquare367 solution = new ValidPerfectSquare367();

    @Test
    public void testCase1() {
        int num = 16;
        boolean output = true;

        assertEquals(output, solution.isPerfectSquare(num));
    }

    @Test
    public void testCase2() {
        int num = 25;
        boolean output = true;

        assertEquals(output, solution.isPerfectSquare(num));
        assertEquals(output, solution.isPerfectSquareNewtonMethod(num));
    }

    @Test
    public void testCase3() {
        // 123 * 123
        int num = 15129;
        boolean output = true;

        assertEquals(output, solution.isPerfectSquare(num));
        assertEquals(output, solution.isPerfectSquareNewtonMethod(num));
    }

    @Test
    public void testCase4() {
        int num = 14;
        boolean output = false;

        assertEquals(output, solution.isPerfectSquare(num));
        assertEquals(output, solution.isPerfectSquareNewtonMethod(num));
    }

    @Test
    public void testCase5() {
        // 899 * 899
        int num = 808201;
        boolean output = true;

        assertEquals(output, solution.isPerfectSquare(num));
        assertEquals(output, solution.isPerfectSquareNewtonMethod(num));
    }

    @Test
    public void testCase6() {
        // 46340 * 46340
        int num = 2147395600;
        boolean output = true;

        assertEquals(output, solution.isPerfectSquare(num));
        assertEquals(output, solution.isPerfectSquareNewtonMethod(num));
    }

}
