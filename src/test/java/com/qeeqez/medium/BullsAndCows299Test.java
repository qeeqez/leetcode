package com.qeeqez.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BullsAndCows299Test {

    BullsAndCows299 solution = new BullsAndCows299();

    @Test
    public void testCase1() {
        String secret = "1807", guess = "7810";
        String output = "1A3B";

        assertEquals(output, solution.getHintHashMap(secret, guess));
        assertEquals(output, solution.getHintOptimized(secret, guess));
        assertEquals(output, solution.getHint(secret, guess));
    }

    @Test
    public void testCase2() {
        String secret = "1123", guess = "0111";
        String output = "1A1B";

        assertEquals(output, solution.getHintHashMap(secret, guess));
        assertEquals(output, solution.getHintOptimized(secret, guess));
        assertEquals(output, solution.getHint(secret, guess));
    }

    @Test
    public void testCase3() {
        String secret = "11", guess = "10";
        String output = "1A0B";

        assertEquals(output, solution.getHintHashMap(secret, guess));
        assertEquals(output, solution.getHintOptimized(secret, guess));
        assertEquals(output, solution.getHint(secret, guess));
    }
}
