package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToInteger13Test {

    RomanToInteger13 romanToInteger = new RomanToInteger13();

    @Test
    public void testCase1() {
        String s = "III";
        int output = 3;

        assertEquals(output, romanToInteger.romanToInt(s));
    }

    @Test
    public void testCase2() {
        String s = "LVIII";
        int output = 58;

        assertEquals(output, romanToInteger.romanToInt(s));
    }

    @Test
    public void testCase3() {
        String s = "MCMXCIV";
        int output = 1994;

        assertEquals(output, romanToInteger.romanToInt(s));
    }
}
