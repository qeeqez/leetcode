package com.qeeqez.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Combinations77Test {

    Combinations77 solution = new Combinations77();

    @Test
    public void testCase1() {
        int n = 4;
        int k = 2;

        List<List<Integer>> output = List.of(
                List.of(1, 2),
                List.of(1, 3),
                List.of(1, 4),
                List.of(2, 3),
                List.of(2, 4),
                List.of(3, 4)
        );

        assertEquals(output, solution.combine(n, k));
    }

    @Test
    public void testCase2() {
        int n = 1;
        int k = 1;

        List<List<Integer>> output = List.of(List.of(1));

        assertEquals(output, solution.combine(n, k));
    }

}
