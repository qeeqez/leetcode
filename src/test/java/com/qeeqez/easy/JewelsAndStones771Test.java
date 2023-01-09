package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JewelsAndStones771Test {

    JewelsAndStones771 solution = new JewelsAndStones771();

    @Test
    public void testCase1() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int output = 3;

        assertEquals(output, solution.numJewelsInStonesSlow(jewels, stones));
        assertEquals(output, solution.numJewelsInStones(jewels, stones));
    }

    @Test
    public void testCase2() {
        String jewels = "z";
        String stones = "ZZ";
        int output = 0;

        assertEquals(output, solution.numJewelsInStonesSlow(jewels, stones));
        assertEquals(output, solution.numJewelsInStones(jewels, stones));
    }
}
