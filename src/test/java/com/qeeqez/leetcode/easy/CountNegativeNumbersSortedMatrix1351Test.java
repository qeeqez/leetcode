package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountNegativeNumbersSortedMatrix1351Test {

    CountNegativeNumbersSortedMatrix1351 solution = new CountNegativeNumbersSortedMatrix1351();

    @Test
    public void testCase1() {
        int[][] grid = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        int output = 8;

        assertEquals(output, solution.countNegatives(grid));
    }

    @Test
    public void testCase2() {
        int[][] grid = {{3, 2}, {1, 0}};
        int output = 0;

        assertEquals(output, solution.countNegatives(grid));
    }

    @Test
    public void testCase3() {
        int[][] grid = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, -1, -1, -2}, {-1, -1, -2, -3}};
        int output = 9;

        assertEquals(output, solution.countNegatives(grid));
    }

}
