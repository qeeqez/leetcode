package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrangingCoins441Test {

    ArrangingCoins441 solution = new ArrangingCoins441();

    @Test
    public void testCase1() {
        int n = 1;
        int output = 1;

        assertEquals(output, solution.arrangeCoins(n));
        assertEquals(output, solution.arrangeCoinsBruteForce(n));
    }

    @Test
    public void testCase2() {
        int n = 3;
        int output = 2;

        assertEquals(output, solution.arrangeCoins(n));
        assertEquals(output, solution.arrangeCoinsBruteForce(n));
    }

    @Test
    public void testCase3() {
        int n = 5;
        int output = 2;

        assertEquals(output, solution.arrangeCoins(n));
        assertEquals(output, solution.arrangeCoinsBruteForce(n));
    }

    @Test
    public void testCase4() {
        int n = 6;
        int output = 3;

        assertEquals(output, solution.arrangeCoins(n));
        assertEquals(output, solution.arrangeCoinsBruteForce(n));
    }

    @Test
    public void testCase5() {
        int n = 8;
        int output = 3;

        assertEquals(output, solution.arrangeCoins(n));
        assertEquals(output, solution.arrangeCoinsBruteForce(n));
    }

    @Test
    public void testCase6() {
        int n = 1804289383;
        int output = 60070;

        assertEquals(output, solution.arrangeCoins(n));
        assertEquals(output, solution.arrangeCoinsBruteForce(n));
    }
}
