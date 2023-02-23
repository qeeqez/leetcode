package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinCostClimbingStairs746Test {

    MinCostClimbingStairs746 solution = new MinCostClimbingStairs746();

    @Test
    public void testCase1() {
        int[] cost = {10, 15, 20};
        int output = 15;

        assertEquals(output, solution.minCostClimbingStairsSlow(cost));
        assertEquals(output, solution.minCostClimbingStairs(cost));
    }

    @Test
    public void testCase2() {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int output = 6;

        assertEquals(output, solution.minCostClimbingStairsSlow(cost));
        assertEquals(output, solution.minCostClimbingStairs(cost));
    }

}
