package com.qeeqez.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumIIInputArraySorted167Test {

    TwoSumIIInputArraySorted167 solution = new TwoSumIIInputArraySorted167();

    @Test
    public void testCase1() {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] output = {1, 2};

        assertArrayEquals(output, solution.twoSumBruteForce(numbers, target));
        assertArrayEquals(output, solution.twoSumHashMap(numbers, target));
        assertArrayEquals(output, solution.twoSum(numbers, target));
    }

    @Test
    public void testCase2() {
        int[] numbers = {2, 3, 4};
        int target = 6;
        int[] output = {1, 3};

        assertArrayEquals(output, solution.twoSumBruteForce(numbers, target));
        assertArrayEquals(output, solution.twoSumHashMap(numbers, target));
        assertArrayEquals(output, solution.twoSum(numbers, target));
    }

    @Test
    public void testCase3() {
        int[] numbers = {-1, 0};
        int target = -1;
        int[] output = {1, 2};

        assertArrayEquals(output, solution.twoSumBruteForce(numbers, target));
        assertArrayEquals(output, solution.twoSumHashMap(numbers, target));
        assertArrayEquals(output, solution.twoSum(numbers, target));
    }

    @Test
    public void testCase4() {
        int[] numbers = {0, 0, 3, 4};
        int target = 0;
        int[] output = {1, 2};

        assertArrayEquals(output, solution.twoSumBruteForce(numbers, target));
        assertArrayEquals(output, solution.twoSumHashMap(numbers, target));
        assertArrayEquals(output, solution.twoSum(numbers, target));
    }
}
