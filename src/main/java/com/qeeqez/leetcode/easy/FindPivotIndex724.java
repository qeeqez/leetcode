package com.qeeqez.leetcode.easy;

/**
 * 724. Find Pivot Index
 * <p>
 * Given an array of integers nums, calculate the pivot index of this array.
 * <p>
 * The pivot index is the index where the sum of all the numbers strictly to the left
 * of the index is equal to the sum of all the numbers strictly to the index's right.
 * <p>
 * If the index is on the left edge of the array, then the left sum is 0
 * because there are no elements to the left. This also applies to the right edge of the array.
 * <p>
 * Return the leftmost pivot index. If no such index exists, return -1.
 */
public class FindPivotIndex724 {

    public int pivotIndex(int[] nums) {
        int sumLeft = 0;
        int sumRight = 0;

        for (int i = 1; i < nums.length; i++) {
            sumRight += nums[i];
        }
        if (sumLeft == sumRight) return 0;
        for (int i = 1; i < nums.length; i++) {
            sumLeft += nums[i - 1];
            sumRight -= nums[i];
            if (sumLeft == sumRight) return i;
        }
        return -1;
    }
}

