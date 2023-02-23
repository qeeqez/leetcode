package com.qeeqez.leetcode.easy;

/**
 * 1486. XOR Operation in an Array
 * <p>
 * You are given an integer n and an integer start.
 * <p>
 * Define an array nums where nums[i] = start + 2 * i (0-indexed) and n == nums.length.
 * <p>
 * Return the bitwise XOR of all elements of nums.
 */
public class XOROperationArray1486 {

    public int xorOperation(int n, int start) {
        int output = 0;
        for (int i = 0; i < n; i++) {
            int numsi = start + 2 * i;
            output = output ^ numsi;
        }
        return output;
    }

}

