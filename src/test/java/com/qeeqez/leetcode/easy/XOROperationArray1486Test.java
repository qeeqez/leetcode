package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class XOROperationArray1486Test {

    XOROperationArray1486 solution = new XOROperationArray1486();

    @Test
    public void testCase1() {
        int n = 5;
        int start = 0;
        int output = 8;

        assertEquals(output, solution.xorOperation(n, start));
    }

    @Test
    public void testCase2() {
        int n = 4;
        int start = 3;
        int output = 8;

        assertEquals(output, solution.xorOperation(n, start));
    }
}
