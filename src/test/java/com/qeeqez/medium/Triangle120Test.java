package com.qeeqez.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Triangle120Test {

    Triangle120 solution = new Triangle120();

    @Test
    public void testCase1() {
        List<List<Integer>> triangle = List.of(
                List.of(2),
                List.of(3, 4),
                List.of(6, 5, 7),
                List.of(4, 1, 8, 3)
        );

        int output = 11;

        assertEquals(output, solution.minimumTotalSlow(triangle));
        assertEquals(output, solution.minimumTotal(triangle));
    }

    @Test
    public void testCase2() {
        List<List<Integer>> triangle = List.of(List.of(-10));

        int output = -10;

        assertEquals(output, solution.minimumTotalSlow(triangle));
        assertEquals(output, solution.minimumTotal(triangle));
    }

}
