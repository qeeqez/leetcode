package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TheKWeakestRowsInMatrix1337Test {

    TheKWeakestRowsInMatrix1337 solution = new TheKWeakestRowsInMatrix1337();

    @Test
    public void testCase1() {
        int[][] mat = {
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}
        };
        int k = 3;
        int[] output = {2, 0, 3};

        assertArrayEquals(output, solution.kWeakestRows(mat, k));
    }

    @Test
    public void testCase2() {
        int[][] mat = {
                {1, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 0, 0}
        };
        int k = 2;
        int[] output = {0, 2};

        assertArrayEquals(output, solution.kWeakestRows(mat, k));
    }

}
