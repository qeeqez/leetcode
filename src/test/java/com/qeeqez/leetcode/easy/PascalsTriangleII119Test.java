package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PascalsTriangleII119Test {

    PascalsTriangleII119 solution = new PascalsTriangleII119();

    @Test
    public void testCase1() {
        int rowIndex = 3;
        List<Integer> output = new ArrayList<>(List.of(1, 3, 3, 1));

        assertEquals(output, solution.getRow(rowIndex));
    }

    @Test
    public void testCase2() {
        int rowIndex = 0;
        List<Integer> output = new ArrayList<>(List.of(1));

        assertEquals(output, solution.getRow(rowIndex));
    }

    @Test
    public void testCase3() {
        int rowIndex = 1;
        List<Integer> output = new ArrayList<>(List.of(1, 1));

        assertEquals(output, solution.getRow(rowIndex));
    }
}
