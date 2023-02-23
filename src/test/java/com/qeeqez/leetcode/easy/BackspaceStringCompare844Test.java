package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BackspaceStringCompare844Test {

    BackspaceStringCompare844 solution = new BackspaceStringCompare844();

    @Test
    public void testCase1() {
        String s = "ab#c";
        String t = "ad#c";

        assertTrue(solution.backspaceCompareStack(s, t));
        assertTrue(solution.backspaceCompare(s, t));
    }

    @Test
    public void testCase2() {
        String s = "ab##";
        String t = "c#d#";

        assertTrue(solution.backspaceCompareStack(s, t));
        assertTrue(solution.backspaceCompare(s, t));
    }

    @Test
    public void testCase3() {
        String s = "a#c";
        String t = "b";

        assertFalse(solution.backspaceCompareStack(s, t));
        assertFalse(solution.backspaceCompare(s, t));
    }

    @Test
    public void testCase4() {
        String s = "a##c";
        String t = "#a#c";

        assertTrue(solution.backspaceCompareStack(s, t));
        assertTrue(solution.backspaceCompare(s, t));
    }

    @Test
    public void testCase5() {
        String s = "abc#";
        String t = "bac#";

        assertFalse(solution.backspaceCompareStack(s, t));
        assertFalse(solution.backspaceCompare(s, t));
    }
}
