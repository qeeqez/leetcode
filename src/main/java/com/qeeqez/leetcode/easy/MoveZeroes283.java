package com.qeeqez.leetcode.easy;

/**
 * 283. Move Zeroes
 * <p>
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * Note that you must do this in-place without making a copy of the array.
 */
public class MoveZeroes283 {
    public void moveZeroes(int[] nums) {
        int countZeros = 0;
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                countZeros++;
            } else {
                nums[j] = nums[i];
                j++;
            }
        }

        for (int i = nums.length - countZeros; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public void moveZeroesSingleLoop(int[] nums) {
        int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) nums[i] = 0;
                j++;
            }
        }
    }
}

