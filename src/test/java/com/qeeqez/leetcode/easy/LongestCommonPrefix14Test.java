package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefix14Test {

    LongestCommonPrefix14 longestCommonPrefix = new LongestCommonPrefix14();

    @Test
    public void testCase1() {
        String[] strs = {"flower", "flow", "flight"};
        String output = "fl";

        assertEquals(output, longestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    public void testCase2() {
        String[] strs = {"dog", "racecar", "car"};
        String output = "";

        assertEquals(output, longestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    public void testCase3() {
        String[] strs = {"flower", "flow", "flight", "fight"};
        String output = "f";

        assertEquals(output, longestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    public void testCase4() {
        String[] strs = {"flower", "flow", "float", "flood"};
        String output = "flo";

        assertEquals(output, longestCommonPrefix.longestCommonPrefix(strs));
    }

    @Test
    public void testCase5() {
        String[] strs = {""};
        String output = "";

        assertEquals(output, longestCommonPrefix.longestCommonPrefix(strs));
    }
}
