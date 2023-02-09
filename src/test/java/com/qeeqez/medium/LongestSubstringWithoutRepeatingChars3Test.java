package com.qeeqez.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubstringWithoutRepeatingChars3Test {

    LongestSubstringWithoutRepeatingChars3 solution = new LongestSubstringWithoutRepeatingChars3();

    @Test
    public void testCase1() {
        String s = "abcabcbb";
        int output = 3;

        assertEquals(output, solution.lengthOfLongestSubstring(s));
    }

    @Test
    public void testCase2() {
        String s = "bbbbb";
        int output = 1;

        assertEquals(output, solution.lengthOfLongestSubstring(s));
    }

    @Test
    public void testCase3() {
        String s = "pwwkew";
        int output = 3;

        assertEquals(output, solution.lengthOfLongestSubstring(s));
    }

    @Test
    public void testCase4() {
        String s = "x";
        int output = 1;

        assertEquals(output, solution.lengthOfLongestSubstring(s));
    }

    @Test
    public void testCase5() {
        String s = "";
        int output = 0;

        assertEquals(output, solution.lengthOfLongestSubstring(s));
    }

    @Test
    public void testCase6() {
        String s = "aab";
        int output = 2;

        assertEquals(output, solution.lengthOfLongestSubstring(s));
    }

    @Test
    public void testCase7() {
        String s = "dvdf";
        int output = 3;

        assertEquals(output, solution.lengthOfLongestSubstring(s));
    }

    @Test
    public void testCase8() {
        String s = "aabaab!bb";
        int output = 3;

        assertEquals(output, solution.lengthOfLongestSubstring(s));
    }
}
