package com.qeeqez.medium;

/**
 * 695. Max Area of Island
 * <p>
 * You are given an m x n binary matrix grid. An island is a group of 1's (representing land) connected 4-directionally (horizontal or vertical.) You may assume all four edges of the grid are surrounded by water.
 * <p>
 * The area of an island is the number of cells with a value 1 in the island.
 * <p>
 * Return the maximum area of an island in grid. If there is no island, return 0.
 */
public class MaxAreaOfIsland695 {

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (isIsland(grid[i][j])) {
                    maxArea = Math.max(maxArea, getAreaSize(grid, i, j));
                }
            }
        }

        return maxArea;
    }

    private int getAreaSize(int[][] grid, int i, int j) {
        int area = 1;
        grid[i][j] = 0;

        if (i - 1 >= 0 && isIsland(grid[i - 1][j])) area += getAreaSize(grid, i - 1, j);
        if (j - 1 >= 0 && isIsland(grid[i][j - 1])) area += getAreaSize(grid, i, j - 1);

        if (i + 1 < grid.length && isIsland(grid[i + 1][j])) area += getAreaSize(grid, i + 1, j);
        if (j + 1 < grid[i].length && isIsland(grid[i][j + 1])) area += getAreaSize(grid, i, j + 1);

        return area;
    }

    private boolean isIsland(int value) {
        return value == 1;
    }
}

