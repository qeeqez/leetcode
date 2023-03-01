package com.qeeqez.leetcode.easy;

/**
 * 1572. Matrix Diagonal Sum
 * <p>
 * Given a square matrix mat, return the sum of the matrix diagonals.
 * <p>
 * Only include the sum of all the elements on the primary diagonal and
 * all the elements on the secondary diagonal that are not part of the primary diagonal.
 */
public class MatrixDiagonalSum1572 {

    // 100% CPU
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            sum += mat[i][i];
            int j = n - i - 1;
            if (i != j) sum += mat[i][j];
        }

        return sum;
    }

}

