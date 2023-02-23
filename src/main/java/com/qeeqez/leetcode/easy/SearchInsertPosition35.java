package com.qeeqez.leetcode.easy;

/**
 * 35. Search Insert Position
 * <p>
 * Given a sorted array of distinct integers and a target value,
 * return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class SearchInsertPosition35 {

    public int searchInsert(int[] nums, int target) {
        int first = 0;
        int last = nums.length - 1;
        int middle;

        while (last >= first) {
            middle = (last - first) / 2 + first;
            if (target == nums[middle]) return middle;
            if (target > nums[middle]) {
                first = middle + 1;
            } else {
                last = middle - 1;
            }
        }
        return first;
    }
}

