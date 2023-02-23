package com.qeeqez.leetcode.easy;

/**
 * 1920. Build Array from Permutation
 * <p>
 * Given a zero-based permutation nums (0-indexed),
 * build an array ans of the same length
 * where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.
 * <p>
 * A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
 */
public class BuildArrayFromPermutation1920 {

    /**
     * No extra space solution
     * <p>
     * Array will be stored in itself as
     * <b>item = n * arr[item] + item.</b>
     * <p>
     * Even if it's already processed, it's still ok,
     * <b>item % n</b> returns the actual value
     */
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] += n * (nums[nums[i]] % n);
        }
        for (int i = 0; i < n; i++) {
            nums[i] /= n;
        }
        return nums;
    }

    // Naive solution
    public int[] buildArrayNaive(int[] nums) {
        int[] output = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            output[i] = nums[nums[i]];
        }
        return output;
    }
}

