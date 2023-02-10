package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecodeMessage2325Test {

    DecodeMessage2325 solution = new DecodeMessage2325();

    @Test
    public void testCase1() {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";

        String output = "this is a secret";

        assertEquals(output, solution.decodeMessage(key, message));
    }

    @Test
    public void testCase2() {
        String key = "eljuxhpwnyrdgtqkviszcfmabo";
        String message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";

        String output = "the five boxing wizards jump quickly";

        assertEquals(output, solution.decodeMessage(key, message));
    }
}