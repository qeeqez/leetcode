package com.qeeqez.leetcode.easy;

/**
 * 1281. Subtract the Product and Sum of Digits of an Integer
 * <p>
 * Given an integer number n,
 * return the difference between the product of its digits and the sum of its digits.
 */
public class SubstractProductAndSumOfDigitsInteger1281 {
    public int subtractProductAndSum(int n) {
        int prod = 1;
        int sum = 0;

        int digit;
        while (n > 0) {
            digit = n % 10;
            n = n / 10;
            prod *= digit;
            sum += digit;
        }
        return prod - sum;
    }
}

