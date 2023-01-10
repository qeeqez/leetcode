package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SquaresOfSortedArray977Test {

    SquaresOfSortedArray977 solution = new SquaresOfSortedArray977();

    @Test
    public void testCase1() {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] output = {0, 1, 9, 16, 100};

        assertArrayEquals(output, solution.sortedSquares(nums));
    }

    @Test
    public void testCase2() {
        int[] nums = {-7, -3, 2, 3, 11};
        int[] output = {4, 9, 9, 49, 121};

        assertArrayEquals(output, solution.sortedSquares(nums));
    }

    @Test
    public void testCase3() {
        int[] nums = {-5, -3, -2, -1};
        int[] output = {1, 4, 9, 25};

        assertArrayEquals(output, solution.sortedSquares(nums));
    }

    @Test
    public void testCase4() {
        int[] nums = {-10};
        int[] output = {100};

        assertArrayEquals(output, solution.sortedSquares(nums));
    }
}
