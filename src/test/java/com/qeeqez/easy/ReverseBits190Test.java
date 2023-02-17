package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseBits190Test {

    ReverseBits190 solution = new ReverseBits190();

    @Test
    public void testCase1() {
        // 00000010100101000001111010011100
        int n = Integer.parseUnsignedInt("43261596");

        // 00111001011110000010100101000000
        int output = Integer.parseUnsignedInt("964176192");

        assertEquals(output, solution.reverseBits(n));
    }

    @Test
    public void testCase2() {
        // 11111111111111111111111111111101
        int n = Integer.parseUnsignedInt("4294967293");

        // 10111111111111111111111111111111
        int output = Integer.parseUnsignedInt("3221225471");

        assertEquals(output, solution.reverseBits(n));
    }

}
