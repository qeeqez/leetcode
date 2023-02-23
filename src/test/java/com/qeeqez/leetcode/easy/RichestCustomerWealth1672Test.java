package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RichestCustomerWealth1672Test {

    RichestCustomerWealth1672 solution = new RichestCustomerWealth1672();

    @Test
    public void testCase1() {
        int[][] accounts = {{1, 2, 3}, {3, 2, 1}};
        int output = 6;

        assertEquals(output, solution.maximumWealth(accounts));
    }

    @Test
    public void testCase2() {
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        int output = 10;

        assertEquals(output, solution.maximumWealth(accounts));
    }

    @Test
    public void testCase3() {
        int[][] accounts = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        int output = 17;

        assertEquals(output, solution.maximumWealth(accounts));
    }
}
