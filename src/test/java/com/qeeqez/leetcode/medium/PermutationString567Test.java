package com.qeeqez.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PermutationString567Test {

    PermutationString567 solution = new PermutationString567();

    @Test
    public void testCase1() {
        String s1 = "ab";
        String s2 = "eidbaooo";

        assertTrue(solution.checkInclusion(s1, s2));
    }

    @Test
    public void testCase2() {
        String s1 = "ab";
        String s2 = "eidboaoo";

        assertFalse(solution.checkInclusion(s1, s2));
    }

    @Test
    public void testCase3() {
        String s1 = "abc";
        String s2 = "bbbca";

        assertTrue(solution.checkInclusion(s1, s2));
    }

    @Test
    public void testCase4() {
        String s1 = "prosperity";
        String s2 = "properties";

        assertFalse(solution.checkInclusion(s1, s2));
    }

    @Test
    public void testCase5() {
        String s1 = "ab";
        String s2 = "eiba";

        assertTrue(solution.checkInclusion(s1, s2));
    }

    @Test
    public void testCase6() {
        String s1 = "a";
        String s2 = "ab";

        assertTrue(solution.checkInclusion(s1, s2));
    }

}
