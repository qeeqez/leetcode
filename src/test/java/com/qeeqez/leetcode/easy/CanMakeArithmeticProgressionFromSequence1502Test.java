package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CanMakeArithmeticProgressionFromSequence1502Test {

    CanMakeArithmeticProgressionFromSequence1502 solution = new CanMakeArithmeticProgressionFromSequence1502();

    @Test
    public void testCase1() {
        int[] nums = {3, 5, 1};

        assertTrue(solution.canMakeArithmeticProgressionSlow(nums));
        assertTrue(solution.canMakeArithmeticProgression(nums));
    }

    @Test
    public void testCase2() {
        int[] nums = {1, 2, 4};

        assertFalse(solution.canMakeArithmeticProgressionSlow(nums));
        assertFalse(solution.canMakeArithmeticProgression(nums));
    }

    @Test
    public void testCase3() {
        int[] nums = {1, 3, 5, 7, 9, 11, 13};

        assertTrue(solution.canMakeArithmeticProgressionSlow(nums));
        assertTrue(solution.canMakeArithmeticProgression(nums));
    }

    @Test
    public void testCase4() {
        int[] nums = {13, 1, 7, 11, 9, 3, 5};

        assertTrue(solution.canMakeArithmeticProgressionSlow(nums));
        assertTrue(solution.canMakeArithmeticProgression(nums));
    }

    @Test
    public void testCase5() {
        int[] nums = {13, 1, 7, 12, 9, 3, 5};

        assertFalse(solution.canMakeArithmeticProgressionSlow(nums));
        assertFalse(solution.canMakeArithmeticProgression(nums));
    }

}
