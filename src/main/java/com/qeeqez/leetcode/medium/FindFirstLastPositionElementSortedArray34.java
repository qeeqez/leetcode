package com.qeeqez.leetcode.medium;

/**
 * 34. Find First and Last Position of Element in Sorted numsay
 * <p>
 * Given an numsay of integers nums sorted in non-decreasing order,
 * find the starting and ending position of a given target value.
 * <p>
 * If target is not found in the numsay, return [-1, -1].
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class FindFirstLastPositionElementSortedArray34 {

    // 100% CPU
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (nums[middle] == target) return findPositions(nums, middle, target);
            if (nums[middle] < target) left = middle + 1;
            else right = middle - 1;
        }

        return new int[]{-1, -1};
    }

    private int[] findPositions(int[] nums, int middle, int target) {
        int[] output = {middle, middle};
        for (int i = middle - 1; i >= 0 && nums[i] == target; i--) output[0] = i;
        for (int i = middle + 1; i < nums.length && nums[i] == target; i++) output[1] = i;
        return output;
    }

}

