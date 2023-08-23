package com.qeeqez.leetcode.easy;

/**
 * 2798. Number of Employees Who Met the Target
 * <p>
 * There are n employees in a company, numbered from 0 to n - 1. Each employee i has worked for hours[i] hours in the company.
 * <p>
 * The company requires each employee to work for at least target hours.
 * <p>
 * You are given a 0-indexed array of non-negative integers hours of length n and a non-negative integer target.
 * <p>
 * Return the integer denoting the number of employees who worked at least target hours.
 */
public class NumberEmployeesWhoMetTarget2798 {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int counter = 0;

        for (int hour : hours) {
            if (hour >= target) counter++;
        }

        return counter;
    }
}

