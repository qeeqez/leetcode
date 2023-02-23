package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsSubsequence392Test {

    IsSubsequence392 solution = new IsSubsequence392();

    @Test
    public void testCase1() {
        String s = "abc", t = "ahbgdc";

        assertTrue(solution.isSubsequence(s, t));
    }

    @Test
    public void testCase2() {
        String s = "axc", t = "ahbgdc";

        assertFalse(solution.isSubsequence(s, t));
    }

    @Test
    public void testCase3() {
        String s = "", t = "ahbgdc";

        assertTrue(solution.isSubsequence(s, t));
    }

    @Test
    public void testCase4() {
        String s = "abc", t = "";

        assertFalse(solution.isSubsequence(s, t));
    }

    @Test
    public void testCase5() {
        String s = "", t = "";

        assertTrue(solution.isSubsequence(s, t));
    }

    @Test
    public void testCase6() {
        String s = "b", t = "abc";

        assertTrue(solution.isSubsequence(s, t));
    }
}
