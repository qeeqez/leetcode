package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PascalsTriangle118Test {

    PascalsTriangle118 solution = new PascalsTriangle118();

    @Test
    public void testCase1() {
        int numRows = 5;
        List<List<Integer>> output = new ArrayList<>(List.of(
                List.of(1),
                List.of(1, 1),
                List.of(1, 2, 1),
                List.of(1, 3, 3, 1),
                List.of(1, 4, 6, 4, 1)
        ));

        assertEquals(output, solution.generate(numRows));
        assertEquals(output, solution.generateOptimized(numRows));
    }

    @Test
    public void testCase2() {
        int numRows = 6;
        List<List<Integer>> output = new ArrayList<>(List.of(
                List.of(1),
                List.of(1, 1),
                List.of(1, 2, 1),
                List.of(1, 3, 3, 1),
                List.of(1, 4, 6, 4, 1),
                List.of(1, 5, 10, 10, 5, 1)
        ));

        assertEquals(output, solution.generate(numRows));
        assertEquals(output, solution.generateOptimized(numRows));
    }

    @Test
    public void testCase3() {
        int numRows = 1;
        List<List<Integer>> output = new ArrayList<>(List.of(
                List.of(1)
        ));

        assertEquals(output, solution.generate(numRows));
        assertEquals(output, solution.generateOptimized(numRows));
    }
}
