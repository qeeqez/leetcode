package com.qeeqez.leetcode.medium;

/**
 * 542. 01 Matrix
 * <p>
 * Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.
 * <p>
 * The distance between two adjacent cells is 1.
 */
@SuppressWarnings("OverwrittenKey")
public class ZeroOneMatrix542 {

    // 93% CPU, 26% MEM
    public int[][] updateMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] result = new int[rows][cols];
        int maxDistance = rows + cols;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0) continue;

                result[i][j] = maxDistance;
                if (i > 0) result[i][j] = Math.min(result[i][j], result[i - 1][j] + 1);
                if (j > 0) result[i][j] = Math.min(result[i][j], result[i][j - 1] + 1);
            }
        }

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 0; j--) {
                if (mat[i][j] == 0) continue;
                if (i < rows - 1) result[i][j] = Math.min(result[i][j], result[i + 1][j] + 1);
                if (j < cols - 1) result[i][j] = Math.min(result[i][j], result[i][j + 1] + 1);
            }
        }

        return result;
    }

    // Time Limit Exceeded
    public int[][] updateMatrixSlow(int[][] mat) {
        boolean[][] visited = new boolean[mat.length][mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (!visited[i][j] && mat[i][j] == 1) {
                    mat[i][j] = getMinDistance(mat, visited, i, j);
                    visited[i][j] = true;
                }
            }
        }

        return mat;
    }

    private int getMinDistance(int[][] mat, boolean[][] visited, int i, int j) {
        if (i < 0 || j < 0 || i >= mat.length || j >= mat[i].length) return 100000;
        if (visited[i][j]) return mat[i][j];
        if (mat[i][j] == 0) return 0;

        visited[i][j] = true;

        mat[i][j] = getMinDistance(mat, visited, i - 1, j) + 1;
        mat[i][j] = Math.min(mat[i][j], getMinDistance(mat, visited, i, j - 1) + 1);
        mat[i][j] = Math.min(mat[i][j], getMinDistance(mat, visited, i + 1, j) + 1);
        mat[i][j] = Math.min(mat[i][j], getMinDistance(mat, visited, i, j + 1) + 1);

        visited[i][j] = false;

        return mat[i][j];
    }

}

