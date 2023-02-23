package com.qeeqez.leetcode.medium;

/**
 * 53. Maximum Subarray
 * <p>
 * Given an integer array nums, find the subarray
 * with the largest sum, and return its sum.
 */
public class MaximumSubarray53 {

    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int maxSum = sum;

        for (int i = 1; i < nums.length; i++) {
            if (sum < 0) sum = 0;
            sum += nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    // Not accepted by Leetcode
    public int maxSubArrayBruteforce(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (maxSum < sum) {
                    maxSum = sum;
                }
            }
        }
        return maxSum;
    }
}

