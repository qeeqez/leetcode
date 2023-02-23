package com.qeeqez.leetcode.easy;

/**
 * 704. Binary Search
 * <p>
 * Given an array of integers nums which is sorted in ascending order,
 * and an integer target, write a function to search target in nums.
 * If target exists, then return its index. Otherwise, return -1.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class BinarySearch704 {

    public int search(int[] nums, int target) {
        if (nums.length == 1) {
            if (nums[0] == target) return 0;
            else return -1;
        }

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
        return -1;
    }

}

