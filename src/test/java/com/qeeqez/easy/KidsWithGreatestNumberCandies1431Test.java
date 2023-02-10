package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KidsWithGreatestNumberCandies1431Test {

    KidsWithGreatestNumberCandies1431 solution = new KidsWithGreatestNumberCandies1431();

    @Test
    public void testCase1() {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> output = List.of(true, true, true, false, true);

        assertEquals(output, solution.kidsWithCandies(candies, extraCandies));
    }

    @Test
    public void testCase2() {
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;

        List<Boolean> output = List.of(true, false, false, false, false);

        assertEquals(output, solution.kidsWithCandies(candies, extraCandies));
    }

    @Test
    public void testCase3() {
        int[] candies = {12, 1, 12};
        int extraCandies = 10;

        List<Boolean> output = List.of(true, false, true);

        assertEquals(output, solution.kidsWithCandies(candies, extraCandies));
    }
}