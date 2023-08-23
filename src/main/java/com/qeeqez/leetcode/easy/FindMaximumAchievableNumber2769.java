package com.qeeqez.leetcode.easy;

/**
 * 2769. Find the Maximum Achievable Number
 * <p>
 * You are given two integers, num and t.
 * An integer x is called achievable if it can become equal to num
 * after applying the following operation no more than t times:
 * * Increase or decrease x by 1, and simultaneously increase or decrease num by 1.
 * Return the maximum possible achievable number. It can be proven that there exists at least one achievable number.
 */
public class FindMaximumAchievableNumber2769 {
    public int theMaximumAchievableX(int num, int t) {
        int diff = t * 2;

        return num + diff;
    }
}

