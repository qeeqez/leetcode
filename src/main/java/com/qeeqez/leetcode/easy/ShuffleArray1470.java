package com.qeeqez.leetcode.easy;

/**
 * 1470. Shuffle the Array
 * <p>
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 * <p>
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */
public class ShuffleArray1470 {

    // No extra space, everything stored in nums
    public int[] shuffle(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            nums[i] += nums[i + n] * 10000;
        }
        for (int i = n - 1; i >= 0; i--) {
            nums[2 * i + 1] = nums[i] / 10000;
            nums[2 * i] = nums[i] % 10000;
        }
        return nums;
    }

    public int[] shuffleNaive(int[] nums, int n) {
        int[] output = new int[nums.length];
        int k = 0;
        for (int i = 0; i < n; i++, k++) {
            output[i + k] = nums[i];
            output[i + k + 1] = nums[i + n];
        }
        return output;
    }
}

