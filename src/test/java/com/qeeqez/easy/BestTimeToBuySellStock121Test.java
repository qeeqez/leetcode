package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BestTimeToBuySellStock121Test {

    BestTimeToBuySellStock121 solution = new BestTimeToBuySellStock121();

    @Test
    public void testCase1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int output = 5;

        assertEquals(output, solution.maxProfitSlow(prices));
        assertEquals(output, solution.maxProfit(prices));
    }

    @Test
    public void testCase2() {
        int[] prices = {7, 6, 4, 3, 1};
        int output = 0;

        assertEquals(output, solution.maxProfitSlow(prices));
        assertEquals(output, solution.maxProfit(prices));
    }

    @Test
    public void testCase3() {
        int[] prices = {7, 10, 1, 12, 4, 2, 13};
        int output = 12;

        assertEquals(output, solution.maxProfitSlow(prices));
        assertEquals(output, solution.maxProfit(prices));
    }

    @Test
    public void testCase4() {
        int[] prices = {2, 4, 1};
        int output = 2;

        assertEquals(output, solution.maxProfitSlow(prices));
        assertEquals(output, solution.maxProfit(prices));
    }
}
