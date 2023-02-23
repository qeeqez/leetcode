package com.qeeqez.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RottingOranges994Test {

    RottingOranges994 solution = new RottingOranges994();

    @Test
    public void testCase1() {
        int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };
        int output = 4;

        assertEquals(output, solution.orangesRotting(grid));
    }

    @Test
    public void testCase2() {
        int[][] grid = {
                {2, 1, 1},
                {0, 1, 1},
                {1, 0, 1}
        };
        int output = -1;

        assertEquals(output, solution.orangesRotting(grid));
    }

    @Test
    public void testCase3() {
        int[][] grid = {
                {0, 2}
        };
        int output = 0;

        assertEquals(output, solution.orangesRotting(grid));
    }

    @Test
    public void testCase4() {
        int[][] grid = {
                {0}
        };
        int output = 0;

        assertEquals(output, solution.orangesRotting(grid));
    }

    @Test
    public void testCase5() {
        int[][] grid = {
                {1}
        };
        int output = -1;

        assertEquals(output, solution.orangesRotting(grid));
    }

    @Test
    public void testCase6() {
        int[][] grid = {
                {0, 1}
        };
        int output = -1;

        assertEquals(output, solution.orangesRotting(grid));
    }

    @Test
    public void testCase7() {
        int[][] grid = {
                {0, 0, 0, 0}
        };
        int output = 0;

        assertEquals(output, solution.orangesRotting(grid));
    }

    @Test
    public void testCase8() {
        int[][] grid = {
                {2, 0, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 0, 1, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 0, 1, 1, 1, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 0, 0, 1, 0, 1},
                {1, 0, 1, 0, 1, 1, 0, 1, 0, 1},
                {1, 0, 1, 0, 0, 0, 0, 1, 0, 1},
                {1, 0, 1, 1, 1, 1, 1, 1, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
        };
        int output = 58;

        assertEquals(output, solution.orangesRotting(grid));
    }
}
