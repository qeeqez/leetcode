package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddBinary67Test {

    AddBinary67 solution = new AddBinary67();

    @Test
    public void testCase1() {
        String a = "11", b = "1";
        String output = "100";

        assertEquals(output, solution.addBinary(a, b));
    }

    @Test
    public void testCase2() {
        String a = "1010", b = "1011";
        String output = "10101";

        assertEquals(output, solution.addBinary(a, b));
    }

    @Test
    public void testCase3() {
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        String output = "110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000";

        assertEquals(output, solution.addBinary(a, b));
    }
}
