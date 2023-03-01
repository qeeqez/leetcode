package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixDiagonalSum1572Test {

    MatrixDiagonalSum1572 solution = new MatrixDiagonalSum1572();

    @Test
    public void testCase1() {
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int output = 25;

        assertEquals(output, solution.diagonalSum(mat));
    }

    @Test
    public void testCase2() {
        int[][] mat = {
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1}
        };
        int output = 8;

        assertEquals(output, solution.diagonalSum(mat));
    }

    @Test
    public void testCase3() {
        int[][] mat = {{5}};
        int output = 5;

        assertEquals(output, solution.diagonalSum(mat));
    }

}
