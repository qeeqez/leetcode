package com.qeeqez.leetcode.easy;

/**
 * 1351. Count Negative Numbers in a Sorted Matrix
 * <p>
 * Given a m x n matrix grid which is sorted in non-increasing order both row-wise and column-wise,
 * return the number of negative numbers in grid.
 */
public class CountNegativeNumbersSortedMatrix1351 {

    // 100% CPU
    public int countNegatives(int[][] grid) {
        int count = 0;

        int left = 0;
        int last = grid[0].length - 1;

        for (int i = grid.length - 1; i >= 0; i--) {
            int[] row = grid[i];

            if (row[last] >= 0) break;

            int right = last;

            while (row[left] >= 0 && left <= right) {
                int middle = (right + left) / 2;
                if (row[middle] >= 0) left = middle + 1;
                else right = middle;
            }

            if (row[left] > 0) break;
            count += last - left + 1;
        }

        return count;
    }

}

