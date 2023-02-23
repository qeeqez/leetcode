package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageSalaryExcludingMinimumMaximumSalary1491Test {

    AverageSalaryExcludingMinimumMaximumSalary1491 solution = new AverageSalaryExcludingMinimumMaximumSalary1491();

    @Test
    public void testCase1() {
        int[] salary = {4000, 3000, 1000, 2000};
        double output = 2500.00000;

        assertEquals(output, solution.averageStreamAPI(salary));
        assertEquals(output, solution.average(salary));
    }

    @Test
    public void testCase2() {
        int[] salary = {1000, 2000, 3000};
        double output = 2000;

        assertEquals(output, solution.averageStreamAPI(salary));
        assertEquals(output, solution.average(salary));
    }

}
