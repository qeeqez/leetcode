package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfGoodPairs1512Test {

    NumberOfGoodPairs1512 solution = new NumberOfGoodPairs1512();

    @Test
    public void testCase1() {
        int[] nums = {1, 2, 3, 1, 1, 3};
        int output = 4;

        assertEquals(output, solution.numIdenticalPairsBruteForce(nums));
        assertEquals(output, solution.numIdenticalPairsMap(nums));
    }

    @Test
    public void testCase2() {
        int[] nums = {1, 1, 1, 1};
        int output = 6;

        assertEquals(output, solution.numIdenticalPairsBruteForce(nums));
        assertEquals(output, solution.numIdenticalPairsMap(nums));
    }

    @Test
    public void testCase3() {
        int[] nums = {1, 2, 3};
        int output = 0;

        assertEquals(output, solution.numIdenticalPairsBruteForce(nums));
        assertEquals(output, solution.numIdenticalPairsMap(nums));
    }
}
