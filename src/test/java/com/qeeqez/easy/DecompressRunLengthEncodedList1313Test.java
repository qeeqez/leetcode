package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DecompressRunLengthEncodedList1313Test {

    DecompressRunLengthEncodedList1313 solution = new DecompressRunLengthEncodedList1313();

    @Test
    public void testCase1() {
        int[] nums = {1, 2, 3, 4};
        int[] output = {2, 4, 4, 4};

        assertArrayEquals(output, solution.decompressRLElistSlowest(nums));
        assertArrayEquals(output, solution.decompressRLElist(nums));
    }

    @Test
    public void testCase2() {
        int[] nums = {1, 1, 2, 3};
        int[] output = {1, 3, 3};

        assertArrayEquals(output, solution.decompressRLElistSlowest(nums));
        assertArrayEquals(output, solution.decompressRLElist(nums));
    }

    @Test
    public void testCase3() {
        int[] nums = {65, 44, 72, 15};
        int[] output = {44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 44, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15};

        assertArrayEquals(output, solution.decompressRLElistSlowest(nums));
        assertArrayEquals(output, solution.decompressRLElist(nums));
    }
}
