package com.qeeqez.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestUncommonSubsequence522Test {

    LongestUncommonSubsequence522 solution = new LongestUncommonSubsequence522();

    @Test
    public void testCase1() {
        String[] strs = {"aba", "cdc", "eae"};
        int output = 3;

        assertEquals(output, solution.findLUSlength(strs));
    }

    @Test
    public void testCase2() {
        String[] strs = {"aaa", "aaa", "aa"};
        int output = -1;

        assertEquals(output, solution.findLUSlength(strs));
    }

    @Test
    public void testCase3() {
        String[] strs = {"aabbcc", "aabbcc", "cb", "abc"};
        int output = 2;

        assertEquals(output, solution.findLUSlength(strs));
    }

}
