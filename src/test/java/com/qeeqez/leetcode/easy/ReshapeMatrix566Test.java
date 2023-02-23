package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReshapeMatrix566Test {

    ReshapeMatrix566 solution = new ReshapeMatrix566();

    @Test
    public void testCase1() {
        int[][] mat = {{1, 2}, {3, 4}};
        int r = 1;
        int c = 4;
        int[][] output = {{1, 2, 3, 4}};

        assertArrayEquals(output, solution.matrixReshape(mat, r, c));
    }

    @Test
    public void testCase2() {
        int[][] mat = {{1, 2}, {3, 4}};
        int r = 2;
        int c = 4;
        int[][] output = {{1, 2}, {3, 4}};

        assertArrayEquals(output, solution.matrixReshape(mat, r, c));
    }

    @Test
    public void testCase3() {
        int[][] mat = {{1, 2}, {3, 4}};
        int r = 4;
        int c = 1;
        int[][] output = {{1}, {2}, {3}, {4}};

        assertArrayEquals(output, solution.matrixReshape(mat, r, c));
    }

}
