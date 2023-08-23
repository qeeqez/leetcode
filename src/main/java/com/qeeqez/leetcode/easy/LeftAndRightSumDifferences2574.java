package com.qeeqez.leetcode.easy;

/**
 * 2574. Left and Right Sum Differences
 * <p>
 * Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:
 * answer.length == nums.length.
 * answer[i] = |leftSum[i] - rightSum[i]|.
 * <p>
 * Where:
 * leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
 * rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
 * <p>
 * Return the array answer.
 */
public class LeftAndRightSumDifferences2574 {
    public int[] leftRightDifference(int[] nums) {
        int length = nums.length;
        int[] output = new int[length];

        int leftSum = 0;
        int rightSum = 0;

        for (int num : nums) {
            rightSum += num;
        }

        for (int i = 0; i < length; i++) {
            rightSum -= nums[i];
            output[i] = Math.abs(rightSum - leftSum);
            leftSum += nums[i];
        }

        return output;
    }
}

