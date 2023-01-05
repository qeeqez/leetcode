package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestUncommonSubsequence521Test {

    LongestUncommonSubsequence521 solution = new LongestUncommonSubsequence521();

    @Test
    public void testCase1() {
        String a = "aba";
        String b = "cdc";
        int output = 3;

        assertEquals(output, solution.findLUSlength(a, b));
    }

    @Test
    public void testCase2() {
        String a = "aaa";
        String b = "bbb";
        int output = 3;

        assertEquals(output, solution.findLUSlength(a, b));
    }

    @Test
    public void testCase3() {
        String a = "aaa";
        String b = "aaa";
        int output = -1;

        assertEquals(output, solution.findLUSlength(a, b));
    }

    @Test
    public void testCase4() {
        String a = "aebdc";
        String b = "bcd";
        int output = 5;

        assertEquals(output, solution.findLUSlength(a, b));
    }
}
