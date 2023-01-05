package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DecodeXORedArray1720Test {

    DecodeXORedArray1720 solution = new DecodeXORedArray1720();

    @Test
    public void testCase1() {
        int[] encoded = {1, 2, 3};
        int first = 1;

        int[] output = {1, 0, 2, 1};

        assertArrayEquals(output, solution.decode(encoded, first));
    }

    @Test
    public void testCase2() {
        int[] encoded = {6, 2, 7, 3};
        int first = 4;

        int[] output = {4, 2, 0, 7, 4};

        assertArrayEquals(output, solution.decode(encoded, first));
    }
}
