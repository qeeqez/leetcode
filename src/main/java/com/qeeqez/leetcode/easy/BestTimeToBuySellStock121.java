package com.qeeqez.leetcode.easy;

/**
 * 121. Best Time to Buy and Sell Stock
 * <p>
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * <p>
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * <p>
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class BestTimeToBuySellStock121 {

    // Faster solution
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int price : prices) {
            min = Math.min(min, price);
            max = Math.max(max, price - min);
        }
        return max;
    }

    public int maxProfitSlow(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int maxProfit = 0;
        for (int i = prices.length - 1; i >= 0; i--) {
            if (prices[i] > max) {
                max = prices[i];
                min = prices[i];
            } else if (prices[i] < min) {
                min = prices[i];
            }
            if (max - min > maxProfit) maxProfit = max - min;
        }
        return Math.max(maxProfit, 0);
    }
}

