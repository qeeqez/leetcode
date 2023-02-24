package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HappyNumber202Test {

    HappyNumber202 solution = new HappyNumber202();

    @Test
    public void testCase1() {
        assertTrue(solution.isHappy(19));
    }

    @Test
    public void testCase2() {
        assertFalse(solution.isHappy(2));
    }

    @Test
    public void testCase3() {
        assertTrue(solution.isHappy(1));
    }

}
