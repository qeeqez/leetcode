package com.qeeqez.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxAreaIsland695Test {

    MaxAreaOfIsland695 solution = new MaxAreaOfIsland695();

    @Test
    public void testCase1() {
        int[][] grid = {
                {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
        };
        int output = 6;

        assertEquals(output, solution.maxAreaOfIsland(grid));
    }

    @Test
    public void testCase2() {
        int[][] grid = {{0, 0, 0, 0, 0, 0, 0, 0}};
        int output = 0;

        assertEquals(output, solution.maxAreaOfIsland(grid));
    }
}
