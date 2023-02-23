package com.qeeqez.leetcode.medium;

/**
 * 62. Unique Paths
 * <p>
 * There is a robot on an m x n grid.
 * The robot is initially located at the top-left corner (i.e., grid[0][0]).
 * The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]).
 * The robot can only move either down or right at any point in time.
 * <p>
 * Given the two integers m and n,
 * return the number of possible unique paths that the robot can take to reach the bottom-right corner.
 * <p>
 * The test cases are generated so that the answer will be less than or equal to 2 * 109.
 */
public class UniquePaths62 {

    private int output = 0;

    // 100% CPU, 80% MEM
    public int uniquePaths(int m, int n) {
        int[][] f = new int[m][n];
        f[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) continue;
                int left = 0;
                int right = 0;
                if (j - 1 >= 0) left = f[i][j - 1];
                if (i - 1 >= 0) right = f[i - 1][j];
                f[i][j] = left + right;
            }
        }
        return f[m - 1][n - 1];
    }

    // TimeLimit exceed for bigger values
    public int uniquePathsRecursive(int m, int n) {
        if (m == 1 && n == 1) output++;
        if (m > 1) uniquePathsRecursive(m - 1, n);
        if (n > 1) uniquePathsRecursive(m, n - 1);
        return output;
    }
}

