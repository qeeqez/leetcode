package com.qeeqez.medium;

/**
 * 74. Search a 2D Matrix
 * <p>
 * You are given an m x n integer matrix matrix with the following two properties:
 * <p>
 * Each row is sorted in non-decreasing order.
 * The first integer of each row is greater than the last integer of the previous row.
 * Given an integer target, return true if target is in matrix or false otherwise.
 * <p>
 * You must write a solution in O(log(m * n)) time complexity.
 */
public class Search2DMatrix74 {

    // 100% CPU, 96% MEM
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowCount = matrix.length;
        int columnCount = matrix[0].length;
        int totalCount = rowCount * columnCount;

        int left = 0;
        int right = totalCount - 1;

        while (left <= right) {
            int middle = (right - left) / 2 + left;

            int row = middle / columnCount;
            int column = middle - row * columnCount;

            int value = matrix[row][column];

            if (value == target) return true;

            if (value > target) right = middle - 1;
            else left = middle + 1;
        }

        return false;
    }
}

