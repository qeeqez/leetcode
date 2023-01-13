package com.qeeqez.easy;

/**
 * 566. Reshape the Matrix
 * <p>
 * In MATLAB, there is a handy function called reshape which can reshape an m x n matrix into a new one with a different size r x c keeping its original data.
 * <p>
 * You are given an m x n matrix mat and two integers r and c representing the number of rows and the number of columns of the wanted reshaped matrix.
 * <p>
 * The reshaped matrix should be filled with all the elements of the original matrix in the same row-traversing order as they were.
 * <p>
 * If the reshape operation with given parameters is possible and legal, output the new reshaped matrix; Otherwise, output the original matrix.
 */
public class ReshapeMatrix566 {

    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (r * c != mat.length * mat[0].length) return mat;

        int m = 0;
        int n = 0;
        int[][] output = new int[r][c];

        for (int[] row : mat) {
            for (int column : row) {
                output[m][n] = column;
                n++;
                if (n == c) {
                    n = 0;
                    m++;
                }
            }
        }
        return output;
    }

}

