package com.qeeqez.leetcode.medium;

/**
 * 33. Search in Rotated Sorted Array
 * <p>
 * There is an integer array nums sorted in ascending order (with distinct values).
 * <p>
 * Prior to being passed to your function,
 * nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length)
 * such that the resulting array is
 * [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
 * For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 * <p>
 * Given the array nums after the possible rotation and an integer target,
 * return the index of target if it is in nums, or -1 if it is not in nums.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class SearchInRotatedSortedArray33 {

    // 100% CPU
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (target == nums[middle]) return middle;

            if (nums[left] <= nums[middle]) {
                if (target <= nums[middle] && target >= nums[left]) right = middle - 1;
                else left = middle + 1;
            } else {
                if (target >= nums[middle] && target <= nums[right]) left = middle + 1;
                else right = middle - 1;
            }
        }

        return -1;
    }

}

