package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoveZeroes283Test {

    MoveZeroes283 solution = new MoveZeroes283();

    @Test
    public void testCase1() {
        int[] nums = {0, 1, 0, 3, 12};
        int[] output = {1, 3, 12, 0, 0};

        solution.moveZeroes(nums);
        assertArrayEquals(output, nums);
    }

    @Test
    public void testCase2() {
        int[] nums = {0};
        int[] output = {0};

        solution.moveZeroes(nums);
        assertArrayEquals(output, nums);
    }
}
