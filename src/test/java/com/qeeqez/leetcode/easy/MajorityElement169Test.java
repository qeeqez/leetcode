package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElement169Test {

    MajorityElement169 solution = new MajorityElement169();

    @Test
    public void testCase1() {
        int[] nums = {3, 2, 3};
        int output = 3;

        assertEquals(output, solution.majorityElement(nums));
    }

    @Test
    public void testCase2() {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int output = 2;

        assertEquals(output, solution.majorityElement(nums));
    }
}
