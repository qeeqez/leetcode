package com.qeeqez.leetcode.easy;

/**
 * 1822. Sign of the Product of an Array
 * <p>
 * There is a function signFunc(x) that returns:
 * <p>
 * 1 if x is positive.
 * -1 if x is negative.
 * 0 if x is equal to 0.
 * You are given an integer array nums. Let product be the product of all values in the array nums.
 * <p>
 * Return signFunc(product).
 */
public class SignOfTheProductOfAnArray1822 {

    // 100% CPU, 40% MEM
    public int arraySign(int[] nums) {
        int result = 1;

        for (int num : nums) {
            if (num == 0) return 0;
            if (num < 0) result *= -1;
        }

        return result;
    }

}

