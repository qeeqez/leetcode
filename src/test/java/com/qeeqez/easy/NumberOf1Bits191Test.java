package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOf1Bits191Test {

    NumberOf1Bits191 solution = new NumberOf1Bits191();

    @Test
    public void testCase1() {
        int n = 0x00000000000000000000000000001011;
        int output = 3;

        assertEquals(output, solution.hammingWeight(n));
    }

    @Test
    public void testCase2() {
        int n = 0x00000000000000000000000010000000;
        int output = 1;

        assertEquals(output, solution.hammingWeight(n));
    }

    @Test
    public void testCase3() {
        // 11111111111111111111111111111101
        int n = Integer.parseUnsignedInt("4294967293");
        int output = 31;

        assertEquals(output, solution.hammingWeight(n));
    }
}
