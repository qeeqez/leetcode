package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberEmployeesWhoMetTarget2798Test {

    NumberEmployeesWhoMetTarget2798 solution = new NumberEmployeesWhoMetTarget2798();

    @Test
    public void testCase1() {
        int[] hours = {0, 1, 2, 3, 4};
        int target = 2;

        int output = 3;

        assertEquals(output, solution.numberOfEmployeesWhoMetTarget(hours, target));
    }

    @Test
    public void testCase2() {
        int[] hours = {5, 1, 4, 2, 2};
        int target = 6;

        int output = 0;

        assertEquals(output, solution.numberOfEmployeesWhoMetTarget(hours, target));
    }
}
