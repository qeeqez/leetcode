package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShuffleString1528Test {

    ShuffleString1528 solution = new ShuffleString1528();

    @Test
    public void testCase1() {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};

        String output = "leetcode";

        assertEquals(output, solution.restoreStringSlowest(s, indices));
        assertEquals(output, solution.restoreStringSlow(s, indices));
        assertEquals(output, solution.restoreString(s, indices));
    }

    @Test
    public void testCase2() {
        String s = "abc";
        int[] indices = {0, 1, 2};

        String output = "abc";

        assertEquals(output, solution.restoreStringSlowest(s, indices));
        assertEquals(output, solution.restoreStringSlow(s, indices));
        assertEquals(output, solution.restoreString(s, indices));
    }
}
