package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckIfOneStringSwapCanMakeStringsEqual1790Test {

    CheckIfOneStringSwapCanMakeStringsEqual1790 solution = new CheckIfOneStringSwapCanMakeStringsEqual1790();

    @Test
    public void testCase1() {
        String s1 = "bank";
        String s2 = "kanb";

        assertTrue(solution.areAlmostEqual(s1, s2));
    }

    @Test
    public void testCase2() {
        String s1 = "attack";
        String s2 = "defend";

        assertFalse(solution.areAlmostEqual(s1, s2));
    }

    @Test
    public void testCase3() {
        String s1 = "kelb";
        String s2 = "kelb";

        assertTrue(solution.areAlmostEqual(s1, s2));
    }

    @Test
    public void testCase4() {
        String s1 = "aa";
        String s2 = "ac";

        assertFalse(solution.areAlmostEqual(s1, s2));
    }

}
