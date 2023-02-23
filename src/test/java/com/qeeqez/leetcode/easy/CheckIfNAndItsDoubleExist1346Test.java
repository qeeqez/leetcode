package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckIfNAndItsDoubleExist1346Test {

    CheckIfNAndItsDoubleExists1346 solution = new CheckIfNAndItsDoubleExists1346();

    @Test
    public void testCase1() {
        int[] arr = {10, 2, 5, 3};
        boolean output = true;

        assertEquals(output, solution.checkIfExist(arr));
        assertEquals(output, solution.checkIfExistSet(arr));
    }

    @Test
    public void testCase2() {
        int[] arr = {3, 1, 7, 11};
        boolean output = false;

        assertEquals(output, solution.checkIfExist(arr));
        assertEquals(output, solution.checkIfExistSet(arr));
    }
}
