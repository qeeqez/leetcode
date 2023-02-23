package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsomorphicStrings205Test {

    IsomorphicStrings205 solution = new IsomorphicStrings205();

    @Test
    public void testCase1() {
        String s = "egg";
        String t = "add";

        assertTrue(solution.isIsomorphicHashMap(s, t));
        assertTrue(solution.isIsomorphicOneLine(s, t));
        assertTrue(solution.isIsomorphic(s, t));
    }

    @Test
    public void testCase2() {
        String s = "foo";
        String t = "bar";

        assertFalse(solution.isIsomorphicHashMap(s, t));
        assertFalse(solution.isIsomorphicOneLine(s, t));
        assertFalse(solution.isIsomorphic(s, t));
    }

    @Test
    public void testCase3() {
        String s = "paper";
        String t = "title";

        assertTrue(solution.isIsomorphicHashMap(s, t));
        assertTrue(solution.isIsomorphicOneLine(s, t));
        assertTrue(solution.isIsomorphic(s, t));
    }

    @Test
    public void testCase4() {
        String s = "a";
        String t = "b";

        assertTrue(solution.isIsomorphicHashMap(s, t));
        assertTrue(solution.isIsomorphicOneLine(s, t));
        assertTrue(solution.isIsomorphic(s, t));
    }

    @Test
    public void testCase5() {
        String s = "badc";
        String t = "baba";

        assertFalse(solution.isIsomorphicHashMap(s, t));
        assertFalse(solution.isIsomorphicOneLine(s, t));
        assertFalse(solution.isIsomorphic(s, t));
    }
}
