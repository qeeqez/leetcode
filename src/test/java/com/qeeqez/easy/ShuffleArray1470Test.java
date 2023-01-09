package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ShuffleArray1470Test {

    ShuffleArray1470 solution = new ShuffleArray1470();

    @Test
    public void testCase1() {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] output = {2, 3, 5, 4, 1, 7};

        assertArrayEquals(output, solution.shuffleNaive(nums, n));
        assertArrayEquals(output, solution.shuffle(nums, n));
    }

    @Test
    public void testCase2() {
        int[] nums = {1, 2, 3, 4, 4, 3, 2, 1};
        int n = 4;
        int[] output = {1, 4, 2, 3, 3, 2, 4, 1};

        assertArrayEquals(output, solution.shuffleNaive(nums, n));
        assertArrayEquals(output, solution.shuffle(nums, n));
    }

    @Test
    public void testCase3() {
        int[] nums = {1, 1, 2, 2};
        int n = 2;
        int[] output = {1, 2, 1, 2};

        assertArrayEquals(output, solution.shuffleNaive(nums, n));
        assertArrayEquals(output, solution.shuffle(nums, n));
    }

    @Test
    public void testCase4() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        int n = 6;
        int[] output = {1, 7, 2, 8, 3, 9, 4, 10, 5, 11, 6, 12};

        assertArrayEquals(output, solution.shuffleNaive(nums, n));
        assertArrayEquals(output, solution.shuffle(nums, n));
    }
}
