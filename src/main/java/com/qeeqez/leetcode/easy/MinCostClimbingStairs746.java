package com.qeeqez.leetcode.easy;

/**
 * 746. Min Cost Climbing Stairs
 * <p>
 * You are given an integer array cost where cost[i] is the cost of ith step on a staircase.
 * Once you pay the cost, you can either climb one or two steps.
 * <p>
 * You can either start from the step with index 0, or the step with index 1.
 * <p>
 * Return the minimum cost to reach the top of the floor.
 */
public class MinCostClimbingStairs746 {

    // Fast Solution, 100% CPU, 67% MEM
    public int minCostClimbingStairs(int[] cost) {
        for (int i = 2; i < cost.length; i++) {
            cost[i] += Math.min(cost[i - 1], cost[i - 2]);
        }
        return Math.min(cost[cost.length - 1], cost[cost.length - 2]);
    }

    // Fibonacci Number with array, 60% CPU, 32% MEM
    public int minCostClimbingStairsSlow(int[] cost) {
        int minCost1 = 0;
        int minCost2 = 0;
        for (int currentCost : cost) {
            int fullCost = currentCost + Math.min(minCost1, minCost2);
            minCost2 = minCost1;
            minCost1 = fullCost;
        }
        return Math.min(minCost1, minCost2);
    }
}

