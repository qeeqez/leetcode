package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToLowerCase709Test {

    ToLowerCase709 solution = new ToLowerCase709();

    @Test
    public void testCase1() {
        String s = "Hello";
        String output = "hello";

        assertEquals(output, solution.toLowerCase(s));
    }

    @Test
    public void testCase2() {
        String s = "here";
        String output = "here";

        assertEquals(output, solution.toLowerCase(s));
    }

    @Test
    public void testCase3() {
        String s = "LOVELY";
        String output = "lovely";

        assertEquals(output, solution.toLowerCase(s));
    }

}
