package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrtX69Test {

    SqrtX69 solution = new SqrtX69();

    @Test
    public void testCase1() {
        int x = 4;
        int output = 2;

        assertEquals(output, solution.mySqrt(x));
    }

    @Test
    public void testCase2() {
        int x = 8;
        int output = 2;

        assertEquals(output, solution.mySqrt(x));
    }
}
