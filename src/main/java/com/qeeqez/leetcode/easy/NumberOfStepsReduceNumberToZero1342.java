package com.qeeqez.leetcode.easy;

/**
 * 1342. Number of Steps to Reduce a Number to Zero
 * <p>
 * Given an integer num, return the number of steps to reduce it to zero.
 * <p>
 * In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
 */
public class NumberOfStepsReduceNumberToZero1342 {

    // Bruteforce solution
    public int numberOfSteps(int num) {
        int count = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num--;
            }
            count++;
        }
        return count;
    }

    // Bitshift solution, same speed
    public int numberOfStepsBitshift(int num) {
        int count = 0;
        while (num > 0) {
            num = ((num & 1) != 0) ? num - 1 : num >> 1;
            count++;
        }
        return count;
    }
}

