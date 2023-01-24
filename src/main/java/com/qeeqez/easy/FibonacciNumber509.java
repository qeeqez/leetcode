package com.qeeqez.easy;

/**
 * 509. Fibonacci Number
 * <p>
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence,
 * such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 * <p>
 * F(0) = 0, F(1) = 1
 * F(n) = F(n - 1) + F(n - 2), for n > 1.
 * <p>
 * Given n, calculate F(n).
 */
public class FibonacciNumber509 {

    // Bruteforce Solution, 100% CPU, 63% MEM
    public int fib(int n) {
        if (n < 2) return n;
        int output = 0;
        int fMinOne = 1;
        int fMinTwo = 0;
        for (int i = 2; i <= n; i++) {
            output = fMinOne + fMinTwo;
            fMinTwo = fMinOne;
            fMinOne = output;
        }
        return output;
    }
}

