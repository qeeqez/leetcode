package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DefangingIPAddress1108Test {

    DefangingIPAddress1108 solution = new DefangingIPAddress1108();

    @Test
    public void testCase1() {
        String address = "1.1.1.1";
        String output = "1[.]1[.]1[.]1";

        assertEquals(output, solution.defangIPaddrNaive(address));
        assertEquals(output, solution.defangIPaddr(address));
    }

    @Test
    public void testCase2() {
        String address = "255.100.50.0";
        String output = "255[.]100[.]50[.]0";

        assertEquals(output, solution.defangIPaddrNaive(address));
        assertEquals(output, solution.defangIPaddr(address));
    }

}
