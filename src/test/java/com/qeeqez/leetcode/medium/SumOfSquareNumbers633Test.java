package com.qeeqez.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SumOfSquareNumbers633Test {

    SumOfSquareNumbers633 solution = new SumOfSquareNumbers633();

    @Test
    public void testCase1() {
        assertTrue(solution.judgeSquareSum(5));
    }

    @Test
    public void testCase2() {
        assertFalse(solution.judgeSquareSum(3));
    }

    @Test
    public void testCase3() {
        assertTrue(solution.judgeSquareSum(0));
    }

    @Test
    public void testCase4() {
        assertFalse(solution.judgeSquareSum(Integer.MAX_VALUE - 1));
    }

    @Test
    public void testCase5() {
        assertTrue(solution.judgeSquareSum(2147483600));
    }

}
