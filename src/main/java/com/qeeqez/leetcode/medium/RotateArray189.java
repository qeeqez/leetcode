package com.qeeqez.leetcode.medium;

/**
 * 189. Rotate Array
 * <p>
 * Given an array, rotate the array to the right by k steps, where k is
 * non-negative.
 */
public class RotateArray189 {

    // 63% CPU, 61% MEM. 1 ms solution
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (k > n) k = k % n;
        if (k == 0) return;

        rotate(nums, 0, n - 1);
        rotate(nums, 0, k - 1);
        rotate(nums, k, n - 1);
    }

    private void rotate(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // CPU 20%, 14% MEM
    public void rotateSlow(int[] nums, int k) {
        if (k > nums.length) k = k % nums.length;
        if (k == 0) return;

        int[] output = nums.clone();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = output[(nums.length - k + i) % nums.length];
        }
    }

}