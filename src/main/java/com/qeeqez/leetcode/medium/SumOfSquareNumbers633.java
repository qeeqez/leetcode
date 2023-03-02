package com.qeeqez.leetcode.medium;

/**
 * 633. Sum of Square Numbers
 * <p>
 * Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.
 */
public class SumOfSquareNumbers633 {

    // 100% CPU
    public boolean judgeSquareSum(int c) {
        long a = 0;
        long b = (long) Math.sqrt(c);

        while (a <= b) {
            long sum = a * a + b * b;
            if (sum == c) return true;

            if (sum < c) a++;
            else b--;
        }

        return false;
    }

}

