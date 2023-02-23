package com.qeeqez.leetcode.easy;

/**
 * 374. Guess Number Higher or Lower
 * <p>
 * Given an integer array nums, return the third distinct maximum number in this array.
 * If the third maximum does not exist, return the maximum number.
 */
public class ThirdMaximumNumber414 {

    @SuppressWarnings("ForLoopReplaceableByForEach")
    public int thirdMax(int[] nums) {
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        if (nums.length == 1) {
            return nums[0];
        }

        int max3 = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < max3) {
                max3 = nums[i];
            }
        }

        int max1 = max3;
        int max2 = max3;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= max1) {
                if (nums[i] != max1) {
                    max3 = max2;
                    max2 = max1;
                    max1 = nums[i];
                }
            } else if (nums[i] >= max2) {
                if (nums[i] != max2) {
                    max3 = max2;
                    max2 = nums[i];
                }
            } else if (nums[i] > max3) {
                max3 = nums[i];
            }
        }
        if (max2 == max3 || max2 == max1) {
            return max1;
        }
        return max3;
    }
}

