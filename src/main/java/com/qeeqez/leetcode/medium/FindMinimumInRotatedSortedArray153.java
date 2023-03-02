package com.qeeqez.leetcode.medium;

/**
 * 153. Find Minimum in Rotated Sorted Array
 * <p>
 * Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
 * For example, the array nums = [0,1,2,4,5,6,7] might become:
 * <p>
 * [4,5,6,7,0,1,2] if it was rotated 4 times.
 * [0,1,2,4,5,6,7] if it was rotated 7 times.
 * Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time
 * results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
 * <p>
 * Given the sorted rotated array nums of unique elements, return the minimum element of this array.
 * <p>
 * You must write an algorithm that runs in O(log n) time.
 */
public class FindMinimumInRotatedSortedArray153 {

    // 100% CPU
    public int findMin(int[] nums) {
        int target = nums[0];

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            target = getMin(nums[left], nums[middle], target);

            if (nums[left] <= nums[middle]) left = middle + 1;
            else right = middle - 1;
        }

        return target;
    }

    private int getMin(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

}

