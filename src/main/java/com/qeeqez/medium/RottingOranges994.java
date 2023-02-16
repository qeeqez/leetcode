package com.qeeqez.medium;

/**
 * 994. Rotting Oranges
 * <p>
 * You are given an m x n grid where each cell can have one of three values:
 * <p>
 * 0 representing an empty cell,
 * 1 representing a fresh orange, or
 * 2 representing a rotten orange.
 * Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.
 * <p>
 * Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.
 */
public class RottingOranges994 {

    // DFS, 100% CPU, 92% MEM
    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) return -1;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2) rotAdjacent(grid, i, j, 2);
            }
        }

        int minutes = 2;
        for (int[] row : grid) {
            for (int cell : row) {
                if (cell == 1) return -1;
                minutes = Math.max(minutes, cell);
            }
        }

        return minutes - 2;
    }

    private void rotAdjacent(int[][] grid, int i, int j, int minutes) {
        boolean isRotten = i < 0 || i >= grid.length
                || j < 0 || j >= grid[0].length
                || grid[i][j] == 0
                || (1 < grid[i][j] && grid[i][j] < minutes);
        if (!isRotten) {
            grid[i][j] = minutes;
            rotAdjacent(grid, i - 1, j, minutes + 1);
            rotAdjacent(grid, i + 1, j, minutes + 1);
            rotAdjacent(grid, i, j - 1, minutes + 1);
            rotAdjacent(grid, i, j + 1, minutes + 1);
        }
    }

}

