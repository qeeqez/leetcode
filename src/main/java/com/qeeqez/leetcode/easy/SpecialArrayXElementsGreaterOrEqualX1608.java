package com.qeeqez.leetcode.easy;

import java.util.Arrays;

/**
 * 1608. Special Array With X Elements Greater Than or Equal X
 * <p>
 * You are given an array nums of non-negative integers.
 * nums is considered special if there exists a number x such that there are exactly x numbers in nums that are greater than or equal to x.
 * <p>
 * Notice that x does not have to be an element in nums.
 * <p>
 * Return x if the array is special, otherwise, return -1.
 * It can be proven that if nums is special, the value for x is unique.
 */
public class SpecialArrayXElementsGreaterOrEqualX1608 {

    // 100% CPU
    public int specialArray(int[] nums) {
        int x = nums.length;
        int[] counts = new int[x + 1];

        for (int elem : nums) {
            if (elem >= x) counts[x]++;
            else counts[elem]++;
        }

        int res = 0;
        for (int i = counts.length - 1; i > 0; i--) {
            res += counts[i];
            if (res == i) return i;
        }

        return -1;
    }

    // 72% CPU
    public int specialArraySlow(int[] nums) {
        Arrays.sort(nums);

        int prev = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == prev) continue;

            int length = nums.length - i;
            if (length <= nums[i] && length > prev) return length;

            prev = nums[i];
        }

        return -1;
    }

}

