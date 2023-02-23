package com.qeeqez.leetcode.easy;

/**
 * 231. Power of Two
 * <p>
 * Given an integer n, return true if it is a power of two. Otherwise, return false.
 * <p>
 * An integer n is a power of two, if there exists an integer x such that n == 2x.
 */
public class PowerOfTwo231 {

    // 100% CPU
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;

        return (n & (n - 1)) == 0;
    }

    // 100% CPU
    public boolean isPowerOfTwoLoop(int n) {
        if (n <= 0) return false;

        while (n > 1) {
            if (n % 2 != 0) return false;
            n /= 2;

        }
        return true;
    }
}

