package com.qeeqez.easy;

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

        for (int i = nums.length - 1; i > nums.length - countZeros - 1; i--) {
            nums[i] = 0;
        }
    }
}

