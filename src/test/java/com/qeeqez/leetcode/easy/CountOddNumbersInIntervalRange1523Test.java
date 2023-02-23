package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountOddNumbersInIntervalRange1523Test {

    CountOddNumbersInIntervalRange1523 solution = new CountOddNumbersInIntervalRange1523();

    @Test
    public void testCase1() {
        int low = 3;
        int high = 7;
        int output = 3;

        assertEquals(output, solution.countOdds(low, high));
    }

    @Test
    public void testCase2() {
        int low = 3;
        int high = 8;
        int output = 3;

        assertEquals(output, solution.countOdds(low, high));
    }

    @Test
    public void testCase3() {
        int low = 4;
        int high = 8;
        int output = 2;

        assertEquals(output, solution.countOdds(low, high));
    }

    @Test
    public void testCase4() {
        int low = 8;
        int high = 10;
        int output = 1;

        assertEquals(output, solution.countOdds(low, high));
    }

    @Test
    public void testCase5() {
        int low = 8;
        int high = 11;
        int output = 2;

        assertEquals(output, solution.countOdds(low, high));
    }

    @Test
    public void testCase6() {
        int low = 7;
        int high = 10;
        int output = 2;

        assertEquals(output, solution.countOdds(low, high));
    }

    @Test
    public void testCase7() {
        int low = 7;
        int high = 11;
        int output = 3;

        assertEquals(output, solution.countOdds(low, high));
    }

    @Test
    public void testCase8() {
        int low = 0;
        int high = 10;
        int output = 5;

        assertEquals(output, solution.countOdds(low, high));
    }

    @Test
    public void testCase9() {
        int low = 0;
        int high = 11;
        int output = 6;

        assertEquals(output, solution.countOdds(low, high));
    }

}
