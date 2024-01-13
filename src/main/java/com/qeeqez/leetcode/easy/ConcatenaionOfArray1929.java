package com.qeeqez.leetcode.easy;

/**
 * 1929. Concatenation of Array
 * <p>
 * Given an integer array nums of length n,
 * you want to create an array ans of length 2n
 * where ans[i] == nums[i] and ans[i + n] == nums[i]
 * for 0 <= i < n (0-indexed).
 * <p>
 * Specifically, ans is the concatenation of two nums arrays.
 * <p>
 * Return the array ans
 */
public class ConcatenaionOfArray1929 {

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }
}

