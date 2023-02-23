package com.qeeqez.leetcode.easy;

import java.util.Arrays;

/**
 * 1491. Average Salary Excluding the Minimum and Maximum Salary
 * <p>
 * You are given an array of unique integers salary where salary[i] is the salary of the ith employee.
 * <p>
 * Return the average salary of employees excluding the minimum and maximum salary.
 * Answers within 10-5 of the actual answer will be accepted.
 */
public class AverageSalaryExcludingMinimumMaximumSalary1491 {

    // 100% CPU, 70% MEM
    public double average(int[] salary) {
        double average = 0.0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int item : salary) {
            average += item;
            min = Math.min(min, item);
            max = Math.max(max, item);
        }
        average -= min + max;
        average /= salary.length - 2;

        return average;
    }

    // Stream API, 7% CPU, 47% MEM
    public double averageStreamAPI(int[] salary) {
        return Arrays.stream(salary)
                .sorted()
                .skip(1)
                .limit(salary.length - 2)
                .average().orElse(0);
    }

}

