package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecryptStringAlphabetIntegerMapping1309Test {

    DecryptStringAlphabetIntegerMapping1309 solution = new DecryptStringAlphabetIntegerMapping1309();

    @Test
    public void testCase1() {
        String s = "10#11#12";
        String output = "jkab";

        assertEquals(output, solution.freqAlphabets(s));
    }

    @Test
    public void testCase2() {
        String s = "1326#";
        String output = "acz";

        assertEquals(output, solution.freqAlphabets(s));
    }
}
