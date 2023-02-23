package com.qeeqez.leetcode.easy;

/**
 * 2235. Add Two Integers
 * <p>
 * Given two integers num1 and num2, return the sum of the two integers.
 */
public class AddTwoIntegers2235 {

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    // It's not faster, but as alternative solution
    public int sumBitwise(int num1, int num2) {
        while (num2 != 0) {
            int carryOver = (num1 & num2) << 1;
            num1 ^= num2;
            num2 = carryOver;
        }
        return num1;
    }
}

