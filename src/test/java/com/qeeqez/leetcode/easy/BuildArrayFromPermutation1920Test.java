package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BuildArrayFromPermutation1920Test {

    BuildArrayFromPermutation1920 solution = new BuildArrayFromPermutation1920();

    int[] numsTestCase1 = {0, 2, 1, 5, 3, 4};
    int[] outputTestCase1 = {0, 1, 2, 4, 5, 3};
    int[] numsTestCase2 = {5, 0, 1, 2, 3, 4};
    int[] outputTestCase2 = {4, 5, 0, 1, 2, 3};

    @Test
    public void testCase1Naive() {
        assertArrayEquals(outputTestCase1, solution.buildArrayNaive(numsTestCase1));
    }

    @Test
    public void testCase1Fast() {
        assertArrayEquals(outputTestCase1, solution.buildArray(numsTestCase1));
    }

    @Test
    public void testCase2Naive() {
        assertArrayEquals(outputTestCase2, solution.buildArrayNaive(numsTestCase2));
    }

    @Test
    public void testCase2Fast() {
        assertArrayEquals(outputTestCase2, solution.buildArray(numsTestCase2));
    }
}
