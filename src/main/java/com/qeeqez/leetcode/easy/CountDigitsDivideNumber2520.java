package com.qeeqez.leetcode.easy;

/**
 * 2520. Count the Digits That Divide a Number
 * <p>
 * Given an integer num, return the number of digits in num that divide num.
 * An integer val divides nums if nums % val == 0.
 */
public class CountDigitsDivideNumber2520 {
    public int countDigits(int num) {
        int output = 0;
        int number = num;
        while (number > 0) {
            if (num % (number % 10) == 0) output++;
            number /= 10;
        }
        return output;
    }
}

