package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidParentheses20Test {

    ValidParentheses20 solution = new ValidParentheses20();

    @Test
    public void testCase1() {
        String s = "()";
        boolean output = true;

        assertEquals(output, solution.isValid(s));
    }

    @Test
    public void testCase2() {
        String s = "()[]{}";
        boolean output = true;

        assertEquals(output, solution.isValid(s));
    }

    @Test
    public void testCase3() {
        String s = "(]";
        boolean output = false;

        assertEquals(output, solution.isValid(s));
    }

    @Test
    public void testCase4() {
        String s = "([])";
        boolean output = true;

        assertEquals(output, solution.isValid(s));
    }

    @Test
    public void testCase5() {
        String s = "[";
        boolean output = false;

        assertEquals(output, solution.isValid(s));
    }

    @Test
    public void testCase6() {
        String s = "((";
        boolean output = false;

        assertEquals(output, solution.isValid(s));
    }

    @Test
    public void testCase7() {
        String s = "){";
        boolean output = false;

        assertEquals(output, solution.isValid(s));
    }

}
