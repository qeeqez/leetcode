package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheDifference389Test {

    FindTheDifference389 solution = new FindTheDifference389();

    @Test
    public void testCase1() {
        String word1 = "abcd";
        String word2 = "abcde";
        char output = 'e';

        assertEquals(output, solution.findTheDifferenceStreamAPI(word1, word2));
        assertEquals(output, solution.findTheDifference(word1, word2));
    }

    @Test
    public void testCase2() {
        String word1 = "";
        String word2 = "y";
        char output = 'y';

        assertEquals(output, solution.findTheDifferenceStreamAPI(word1, word2));
        assertEquals(output, solution.findTheDifference(word1, word2));
    }

    @Test
    public void testCase3() {
        String word1 = "a";
        String word2 = "aa";
        char output = 'a';

        assertEquals(output, solution.findTheDifferenceStreamAPI(word1, word2));
        assertEquals(output, solution.findTheDifference(word1, word2));
    }

}
