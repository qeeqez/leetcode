package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMaximumAchievableNumber2769Test {

    FindMaximumAchievableNumber2769 solution = new FindMaximumAchievableNumber2769();

    @Test
    public void testCase1() {
        int num = 4;
        int t = 1;

        int output = 6;

        assertEquals(output, solution.theMaximumAchievableX(num, t));
    }

    @Test
    public void testCase2() {
        int num = 3;
        int t = 2;

        int output = 7;

        assertEquals(output, solution.theMaximumAchievableX(num, t));
    }
}
