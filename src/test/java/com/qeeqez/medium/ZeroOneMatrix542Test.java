package com.qeeqez.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ZeroOneMatrix542Test {

    ZeroOneMatrix542 solution = new ZeroOneMatrix542();

    @Test
    public void testCase1() {
        int[][] mat = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        int[][] output = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };

        assertArrayEquals(output, solution.updateMatrixSlow(mat));
        assertArrayEquals(output, solution.updateMatrix(mat));
    }

    @Test
    public void testCase2() {
        int[][] mat = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };
        int[][] output = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 2, 1}
        };

        assertArrayEquals(output, solution.updateMatrixSlow(mat));
        assertArrayEquals(output, solution.updateMatrix(mat));
    }

    @Test
    public void testCase3() {
        int[][] mat = {
                {1, 0, 1, 1, 0, 0, 1, 0, 0, 1},
                {0, 1, 1, 0, 1, 0, 1, 0, 1, 1},
                {0, 0, 1, 0, 1, 0, 0, 1, 0, 0},
                {1, 0, 1, 0, 1, 1, 1, 1, 1, 1},
                {0, 1, 0, 1, 1, 0, 0, 0, 0, 1},
                {0, 0, 1, 0, 1, 1, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 0, 0, 1, 1},
                {1, 0, 0, 0, 1, 1, 1, 1, 0, 1},
                {1, 1, 1, 1, 1, 1, 1, 0, 1, 0},
                {1, 1, 1, 1, 0, 1, 0, 0, 1, 1}
        };

        int[][] output = {
                {1, 0, 1, 1, 0, 0, 1, 0, 0, 1},
                {0, 1, 1, 0, 1, 0, 1, 0, 1, 1},
                {0, 0, 1, 0, 1, 0, 0, 1, 0, 0},
                {1, 0, 1, 0, 1, 1, 1, 1, 1, 1},
                {0, 1, 0, 1, 1, 0, 0, 0, 0, 1},
                {0, 0, 1, 0, 1, 1, 1, 0, 1, 0},
                {0, 1, 0, 1, 0, 1, 0, 0, 1, 1},
                {1, 0, 0, 0, 1, 2, 1, 1, 0, 1},
                {2, 1, 1, 1, 1, 2, 1, 0, 1, 0},
                {3, 2, 2, 1, 0, 1, 0, 0, 1, 1}
        };

        assertArrayEquals(output, solution.updateMatrixSlow(mat));
        assertArrayEquals(output, solution.updateMatrix(mat));
    }

    @Test
    public void testCase4() {
        int[][] mat = {
                {0, 0, 1, 0, 1, 1, 1, 0, 1, 1},
                {1, 1, 1, 1, 0, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 0, 0, 0, 1, 1},
                {1, 0, 1, 0, 1, 1, 1, 0, 1, 1},
                {0, 0, 1, 1, 1, 0, 1, 1, 1, 1},
                {1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 0, 1, 0, 1, 0, 1},
                {0, 1, 0, 0, 0, 1, 0, 0, 1, 1},
                {1, 1, 1, 0, 1, 1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1, 0, 1, 1, 1, 0}
        };

        int[][] output = {
                {0, 0, 1, 0, 1, 2, 1, 0, 1, 2},
                {1, 1, 2, 1, 0, 1, 1, 1, 2, 3},
                {2, 1, 2, 1, 1, 0, 0, 0, 1, 2},
                {1, 0, 1, 0, 1, 1, 1, 0, 1, 2},
                {0, 0, 1, 1, 1, 0, 1, 1, 2, 3},
                {1, 0, 1, 2, 1, 1, 1, 2, 1, 2},
                {1, 1, 1, 1, 0, 1, 0, 1, 0, 1},
                {0, 1, 0, 0, 0, 1, 0, 0, 1, 2},
                {1, 1, 1, 0, 1, 1, 0, 1, 0, 1},
                {1, 0, 1, 1, 1, 0, 1, 2, 1, 0}
        };

        assertArrayEquals(output, solution.updateMatrixSlow(mat));
        assertArrayEquals(output, solution.updateMatrix(mat));
    }
}
