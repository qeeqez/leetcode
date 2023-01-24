package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciNumber509Test {

    FibonacciNumber509 solution = new FibonacciNumber509();

    @Test
    public void testCase1() {
        int n = 2;
        int output = 1;

        assertEquals(output, solution.fib(n));
    }

    @Test
    public void testCase2() {
        int n = 3;
        int output = 2;

        assertEquals(output, solution.fib(n));
    }

    @Test
    public void testCase3() {
        int n = 4;
        int output = 3;

        assertEquals(output, solution.fib(n));
    }

    @Test
    public void testCase4() {
        int n = 10;
        int output = 55;

        assertEquals(output, solution.fib(n));
    }

}
