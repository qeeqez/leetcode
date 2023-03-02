package com.qeeqez.leetcode.easy;

import java.util.stream.IntStream;

/**
 * 303. Range Sum Query - Immutable
 * <p>
 * Given an integer array nums, handle multiple queries of the following type:
 * <p>
 * Calculate the sum of the elements of nums between indices left and right inclusive
 * where left <= right.
 * <p>
 * Implement the NumArray class:
 * <p>
 * NumArray(int[] nums) Initializes the object with the integer array nums.
 * <p>
 * int sumRange(int left, int right)
 * Returns the sum of the elements of nums between indices left and right inclusive
 * (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 */
public class RangeSumQueryImmutable303 {

    static class NumArray {

        private final int[] nums;

        public NumArray(int[] nums) {
            this.nums = nums;
        }

        public int sumRange(int left, int right) {
            return IntStream.rangeClosed(left, right)
                    .map(i -> nums[i])
                    .sum();
        }
    }

}

