package com.qeeqez.leetcode.easy;

/**
 * 69. Sqrt(x)
 * <p>
 * Given a non-negative integer x,
 * return the square root of x rounded down to the nearest integer.
 * The returned integer should be non-negative as well.
 * <p>
 * You must not use any built-in exponent function or operator.
 * <p>
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 */
public class SqrtX69 {
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int pivot;
        long target;

        int left = 2;
        int right = x / 2;
        while (right >= left) {

            pivot = left + (right - left) / 2;
            target = (long) pivot * pivot;

            if (target > x) {
                right = pivot - 1;
            } else if (target < x) {
                left = pivot + 1;
            } else {
                return pivot;
            }
        }

        return right;
    }
}

