package com.qeeqez.easy;

/**
 * 1672. Richest Customer Wealth
 * <p>
 * You are given an m x n integer grid accounts where accounts[i][j]
 * is the amount of money the i'th customer has in the j'th bank.
 * Return the wealth that the richest customer has.
 * <p>
 * A customer's wealth is the amount of money they have in all their bank accounts.
 * The richest customer is the customer that has the maximum wealth.
 */
public class RichestCustomerWealth1672 {

    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) {
            int currentWealth = 0;
            for (int item : account) {
                currentWealth += item;
            }
            if (maxWealth < currentWealth) maxWealth = currentWealth;
        }
        return maxWealth;
    }
}

