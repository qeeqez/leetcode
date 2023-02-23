package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberHigherOrLower374Test {

    GuessNumberHigherOrLower374 solution = new GuessNumberHigherOrLower374();

    @Test
    public void testCase1() {
        int n = 10;
        int pick = 6;
        int output = 6;

        assertEquals(output, solution.guessNumber(n, pick));
    }

    @Test
    public void testCase2() {
        int n = 1;
        int pick = 1;
        int output = 1;

        assertEquals(output, solution.guessNumber(n, pick));
    }

    @Test
    public void testCase3() {
        int n = 2;
        int pick = 1;
        int output = 1;

        assertEquals(output, solution.guessNumber(n, pick));
    }
}
