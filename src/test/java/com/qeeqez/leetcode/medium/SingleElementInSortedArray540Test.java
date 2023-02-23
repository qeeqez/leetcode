package com.qeeqez.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleElementInSortedArray540Test {

    SingleElementInSortedArray540 solution = new SingleElementInSortedArray540();

    @Test
    public void testCase1() {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int output = 2;

        assertEquals(output, solution.singleNonDuplicateBruteForce(nums));
        assertEquals(output, solution.singleNonDuplicate(nums));
    }

    @Test
    public void testCase2() {
        int[] nums = {3, 3, 7, 7, 10, 11, 11};
        int output = 10;

        assertEquals(output, solution.singleNonDuplicateBruteForce(nums));
        assertEquals(output, solution.singleNonDuplicate(nums));
    }

    @Test
    public void testCase3() {
        int[] nums = {1};
        int output = 1;

        assertEquals(output, solution.singleNonDuplicateBruteForce(nums));
        assertEquals(output, solution.singleNonDuplicate(nums));
    }
}
