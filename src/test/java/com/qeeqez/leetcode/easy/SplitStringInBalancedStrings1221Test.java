package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SplitStringInBalancedStrings1221Test {

    SplitStringInBalancedStrings1221 solution = new SplitStringInBalancedStrings1221();

    @Test
    public void testCase1() {
        String s = "RLRRLLRLRL";
        int output = 4;

        assertEquals(output, solution.balancedStringSplit(s));
    }

    @Test
    public void testCase2() {
        String s = "RLRRRLLRLL";
        int output = 2;

        assertEquals(output, solution.balancedStringSplit(s));
    }

    @Test
    public void testCase3() {
        String s = "LLLLRRRR";
        int output = 1;

        assertEquals(output, solution.balancedStringSplit(s));
    }

}
