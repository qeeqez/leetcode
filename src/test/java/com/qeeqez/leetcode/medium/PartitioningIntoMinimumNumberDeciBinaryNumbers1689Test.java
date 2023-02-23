package com.qeeqez.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartitioningIntoMinimumNumberDeciBinaryNumbers1689Test {

    PartitioningIntoMinimumNumberDeciBinaryNumbers1689 solution = new PartitioningIntoMinimumNumberDeciBinaryNumbers1689();

    @Test
    public void testCase1() {
        String n = "32";
        int output = 3;

        assertEquals(output, solution.minPartitionsOptimized(n));
        assertEquals(output, solution.minPartitions(n));
    }

    @Test
    public void testCase2() {
        String n = "82734";
        int output = 8;

        assertEquals(output, solution.minPartitionsOptimized(n));
        assertEquals(output, solution.minPartitions(n));
    }

    @Test
    public void testCase3() {
        String n = "27346209830709182346";
        int output = 9;

        assertEquals(output, solution.minPartitionsOptimized(n));
        assertEquals(output, solution.minPartitions(n));
    }
}
