package com.qeeqez.medium;

/**
 * 189. Rotate Array
 * <p>
 * Given an array, rotate the array to the right by k steps, where k is
 * non-negative.
 */
public class RotateArray189 {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        for (int i = 0; i < n; i++) {
            int index = (n - k + i) % n;
            nums[i] += n * (nums[index] % n);
        }
        for (int i = 0; i < n; i++) {
            nums[i] /= n;
        }
    }
}