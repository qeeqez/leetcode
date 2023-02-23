package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseString344Test {

    ReverseString344 solution = new ReverseString344();

    @Test
    public void testCase1() {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        char[] output = {'o', 'l', 'l', 'e', 'h'};

        solution.reverseString(s);
        assertArrayEquals(output, s);
    }

    @Test
    public void testCase2() {
        char[] s = {'H', 'a', 'n', 'n', 'a', 'h'};
        char[] output = {'h', 'a', 'n', 'n', 'a', 'H'};

        solution.reverseString(s);
        assertArrayEquals(output, s);
    }

    @Test
    public void testCase3() {
        char[] s = {'A'};
        char[] output = {'A'};

        solution.reverseString(s);
        assertArrayEquals(output, s);
    }
}
