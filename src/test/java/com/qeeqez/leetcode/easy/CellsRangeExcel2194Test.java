package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CellsRangeExcel2194Test {

    CellsRangeExcel2194 solution = new CellsRangeExcel2194();

    @Test
    public void testCase1() {
        String s = "K1:L2";
        List<String> output = Arrays.asList("K1", "K2", "L1", "L2");

        assertEquals(output, solution.cellsInRangeSlow(s));
        assertEquals(output, solution.cellsInRange(s));
    }

    @Test
    public void testCase2() {
        String s = "A1:F1";
        List<String> output = Arrays.asList("A1", "B1", "C1", "D1", "E1", "F1");

        assertEquals(output, solution.cellsInRangeSlow(s));
        assertEquals(output, solution.cellsInRange(s));
    }
}
