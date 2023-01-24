package com.qeeqez.easy;

/**
 * 70. Climbing Stairs
 * <p>
 * You are climbing a staircase. It takes n steps to reach the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbingStairs70 {

    // Fibonacci Number with fix, 100% CPU, 70% MEM
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int output = 0;
        int fMinOne = 1;
        int fMinTwo = 1;
        for (int i = 2; i <= n; i++) {
            output = fMinOne + fMinTwo;
            fMinTwo = fMinOne;
            fMinOne = output;
        }
        return output;
    }
}

