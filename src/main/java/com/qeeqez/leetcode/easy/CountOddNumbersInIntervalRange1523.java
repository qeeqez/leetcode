package com.qeeqez.leetcode.easy;

/**
 * 1523. Count Odd Numbers in an Interval Range
 * <p>
 * Given two non-negative integers low and high.
 * Return the count of odd numbers between low and high (inclusive).
 */
public class CountOddNumbersInIntervalRange1523 {

    public int countOdds(int low, int high) {
        int highMinusLow = high - low + 1;
        int divideByTwo = highMinusLow / 2;
        divideByTwo += high % 2 == 1 && low % 2 == 1 ? 1 : 0;

        return divideByTwo;
    }

}

