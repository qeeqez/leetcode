package com.qeeqez.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Search2DMatrix74Test {

    Search2DMatrix74 solution = new Search2DMatrix74();

    @Test
    public void testCase1() {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target = 3;

        assertTrue(solution.searchMatrix(matrix, target));
    }

    @Test
    public void testCase2() {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target = 13;

        assertFalse(solution.searchMatrix(matrix, target));
    }

    @Test
    public void testCase3() {
        int[][] matrix = {{1}};

        int target = 1;

        assertTrue(solution.searchMatrix(matrix, target));
    }

    @Test
    public void testCase4() {
        int[][] matrix = {{1}};

        int target = 2;

        assertFalse(solution.searchMatrix(matrix, target));
    }

    @Test
    public void testCase5() {
        int[][] matrix = {
                {1, 3, 5},
                {7, 10, 11},
                {16, 20, 23},
                {30, 34, 60}
        };

        int target = 30;

        assertTrue(solution.searchMatrix(matrix, target));
    }

    @Test
    public void testCase6() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        int target = 8;

        assertTrue(solution.searchMatrix(matrix, target));
    }

    @Test
    public void testCase7() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        int target = 9;

        assertTrue(solution.searchMatrix(matrix, target));
    }
}
