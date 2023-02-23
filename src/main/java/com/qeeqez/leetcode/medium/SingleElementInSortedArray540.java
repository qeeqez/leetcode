package com.qeeqez.leetcode.medium;

/**
 * 540. Single Element in a Sorted Array
 * <p>
 * You are given a sorted array consisting of only integers where every element appears exactly twice,
 * except for one element which appears exactly once.
 * <p>
 * Return the single element that appears only once.
 * <p>
 * Your solution must run in O(log n) time and O(1) space.
 */
public class SingleElementInSortedArray540 {

    // 100% CPU, 86% MEM, Binary Search
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int middle = (left + right) / 2;

            if (isElementSingle(middle, nums)) left = middle + 1;
            else right = middle;
        }

        return nums[left];
    }

    private boolean isElementSingle(int index, int[] nums) {
        return index % 2 == 0 ?
                nums[index] == nums[index + 1]
                : nums[index] == nums[index - 1];
    }


    // 30% CPU, 86% MEM, Brute Force
    public int singleNonDuplicateBruteForce(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (isElementSingleBruteForce(i, nums)) return nums[i];
            else i++;
        }

        return 0;
    }

    private boolean isElementSingleBruteForce(int index, int[] nums) {
        return (index - 1 < 0 || nums[index - 1] != nums[index]) &&
                (index + 1 >= nums.length || nums[index + 1] != nums[index]);
    }

}

