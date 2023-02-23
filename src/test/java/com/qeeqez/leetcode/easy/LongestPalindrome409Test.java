package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindrome409Test {

    LongestPalindrome409 solution = new LongestPalindrome409();

    @Test
    public void testCase1() {
        String s = "abccccdd";
        int output = 7;

        assertEquals(output, solution.longestPalindromeHashSet(s));
        assertEquals(output, solution.longestPalindromeHashMap(s));
        assertEquals(output, solution.longestPalindrome(s));
    }

    @Test
    public void testCase2() {
        String s = "a";
        int output = 1;

        assertEquals(output, solution.longestPalindromeHashSet(s));
        assertEquals(output, solution.longestPalindromeHashMap(s));
        assertEquals(output, solution.longestPalindrome(s));
    }

    @Test
    public void testCase3() {
        String s = "aa";
        int output = 2;

        assertEquals(output, solution.longestPalindromeHashSet(s));
        assertEquals(output, solution.longestPalindromeHashMap(s));
        assertEquals(output, solution.longestPalindrome(s));
    }

    @Test
    public void testCase4() {
        String s = "ab";
        int output = 1;

        assertEquals(output, solution.longestPalindromeHashSet(s));
        assertEquals(output, solution.longestPalindromeHashMap(s));
        assertEquals(output, solution.longestPalindrome(s));
    }

    @Test
    public void testCase5() {
        String s = "aabccccdd";
        int output = 9;

        assertEquals(output, solution.longestPalindromeHashSet(s));
        assertEquals(output, solution.longestPalindromeHashMap(s));
        assertEquals(output, solution.longestPalindrome(s));
    }

    @Test
    public void testCase6() {
        String s = "aaabccccdd";
        int output = 9;

        assertEquals(output, solution.longestPalindromeHashSet(s));
        assertEquals(output, solution.longestPalindromeHashMap(s));
        assertEquals(output, solution.longestPalindrome(s));
    }

    @Test
    public void testCase7() {
        String s = "ccd";
        int output = 3;

        assertEquals(output, solution.longestPalindromeHashSet(s));
        assertEquals(output, solution.longestPalindromeHashMap(s));
        assertEquals(output, solution.longestPalindrome(s));
    }

    @Test
    public void testCase8() {
        String s = "ccc";
        int output = 3;

        assertEquals(output, solution.longestPalindromeHashSet(s));
        assertEquals(output, solution.longestPalindromeHashMap(s));
        assertEquals(output, solution.longestPalindrome(s));
    }
}
