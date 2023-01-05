package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CreateTargetArrayGivenOrder1389Test {

    CreateTargetArrayGivenOrder1389 solution = new CreateTargetArrayGivenOrder1389();

    @Test
    public void testCase1() {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};

        int[] output = {0, 4, 1, 3, 2};

        assertArrayEquals(output, solution.createTargetArraySlowest(nums, index));
        assertArrayEquals(output, solution.createTargetArray(nums, index));
    }

    @Test
    public void testCase2() {
        int[] nums = {1, 2, 3, 4, 0};
        int[] index = {0, 1, 2, 3, 0};

        int[] output = {0, 1, 2, 3, 4};

        assertArrayEquals(output, solution.createTargetArraySlowest(nums, index));
        assertArrayEquals(output, solution.createTargetArray(nums, index));
    }

    @Test
    public void testCase3() {
        int[] nums = {1};
        int[] index = {0};

        int[] output = {1};

        assertArrayEquals(output, solution.createTargetArraySlowest(nums, index));
        assertArrayEquals(output, solution.createTargetArray(nums, index));
    }
}
