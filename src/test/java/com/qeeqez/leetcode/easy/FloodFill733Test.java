package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FloodFill733Test {

    FloodFill733 solution = new FloodFill733();

    @Test
    public void testCase1() {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1, sc = 1, color = 2;
        int[][] output = {{2, 2, 2}, {2, 2, 0}, {2, 0, 1}};

        assertArrayEquals(output, solution.floodFill(image, sr, sc, color));
    }

    @Test
    public void testCase2() {
        int[][] image = {{0, 0, 0}, {0, 0, 0}};
        int sr = 0, sc = 0, color = 0;
        int[][] output = {{0, 0, 0}, {0, 0, 0}};

        assertArrayEquals(output, solution.floodFill(image, sr, sc, color));
    }

    @Test
    public void testCase3() {
        int[][] image = {{1}};
        int sr = 0, sc = 0, color = 2;
        int[][] output = {{2}};

        assertArrayEquals(output, solution.floodFill(image, sr, sc, color));
    }

    @Test
    public void testCase4() {
        int[][] image = {{0, 0, 0}, {0, 0, 0}};
        int sr = 1, sc = 0, color = 2;
        int[][] output = {{2, 2, 2}, {2, 2, 2}};

        assertArrayEquals(output, solution.floodFill(image, sr, sc, color));
    }
}
