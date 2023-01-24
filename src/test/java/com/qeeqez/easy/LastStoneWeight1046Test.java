package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LastStoneWeight1046Test {

    LastStoneWeight1046 solution = new LastStoneWeight1046();

    @Test
    public void testCase1() {
        int[] stones = {2, 7, 4, 1, 8, 1};
        int output = 1;

        assertEquals(output, solution.lastStoneWeight(stones));
    }

    @Test
    public void testCase2() {
        int[] stones = {1};
        int output = 1;

        assertEquals(output, solution.lastStoneWeight(stones));
    }
}
