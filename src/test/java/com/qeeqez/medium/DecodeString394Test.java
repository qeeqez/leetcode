package com.qeeqez.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecodeString394Test {

    DecodeString394 solution = new DecodeString394();

    @Test
    public void testCase1() {
        String s = "3[a]2[bc]";
        String output = "aaabcbc";

        assertEquals(output, solution.decodeString(s));
    }

    @Test
    public void testCase2() {
        String s = "3[a2[c]]";
        String output = "accaccacc";

        assertEquals(output, solution.decodeString(s));
    }

    @Test
    public void testCase3() {
        String s = "2[abc]3[cd]ef";
        String output = "abcabccdcdcdef";

        assertEquals(output, solution.decodeString(s));
    }

    @Test
    public void testCase4() {
        String s = "df3[a2[c]]jk2[oem]";
        String output = "dfaccaccaccjkoemoem";

        assertEquals(output, solution.decodeString(s));
    }

    @Test
    public void testCase5() {
        String s = "100[leetcode]";
        String output = "leetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcodeleetcode";

        assertEquals(output, solution.decodeString(s));
    }
}
