package com.qeeqez.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Permutations46Test {

    Permutations46 solution = new Permutations46();

    @Test
    public void testCase1() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> output = List.of(
                List.of(1, 2, 3),
                List.of(1, 3, 2),
                List.of(2, 1, 3),
                List.of(2, 3, 1),
                List.of(3, 1, 2),
                List.of(3, 2, 1)
        );

        assertEquals(output, solution.permute(nums));
    }

    @Test
    public void testCase2() {
        int[] nums = {0, 1};
        List<List<Integer>> output = List.of(
                List.of(0, 1),
                List.of(1, 0)
        );

        assertEquals(output, solution.permute(nums));
    }

    @Test
    public void testCase3() {
        int[] nums = {0, 1};
        List<List<Integer>> output = List.of(
                List.of(0, 1),
                List.of(1, 0)
        );

        assertEquals(output, solution.permute(nums));
    }

}
