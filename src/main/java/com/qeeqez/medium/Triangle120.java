package com.qeeqez.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 120. Triangle
 * <p>
 * Given a triangle array, return the minimum path sum from top to bottom.
 * <p>
 * For each step, you may move to an adjacent number of the row below.
 * More formally, if you are on index i on the current row, you may move to either index i or index i + 1 on the next row.
 */
public class Triangle120 {

    // 100% CPU, 53% MEM
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n + 1][n + 1];
        for (int[] array : dp) Arrays.fill(array, Integer.MIN_VALUE);
        return helper(triangle, 0, 0, dp);
    }

    public int helper(List<List<Integer>> triangle, int i, int j, int[][] dp) {
        if (i == triangle.size()) return dp[i][j] = 0;
        if (dp[i][j] != Integer.MIN_VALUE) return dp[i][j];
        return dp[i][j] = triangle.get(i).get(j) +
                Math.min(helper(triangle, i + 1, j, dp), helper(triangle, i + 1, j + 1, dp));
    }

    // 60% CPU, 94% MEM
    public int minimumTotalSlow(List<List<Integer>> triangle) {
        List<Integer> nextRow = new ArrayList<>(triangle.get(triangle.size() - 1));
        for (int i = triangle.size() - 1; i > 0; i--) {
            List<Integer> row = nextRow;
            nextRow = new ArrayList<>(triangle.get(i - 1));

            for (int j = 0; j < nextRow.size(); j++) {
                int min = nextRow.get(j) + Math.min(row.get(j), row.get(j + 1));
                nextRow.set(j, min);
            }
        }

        return nextRow.get(0);
    }

}

