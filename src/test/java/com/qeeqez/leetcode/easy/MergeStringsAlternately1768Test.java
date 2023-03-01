package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeStringsAlternately1768Test {

    MergeStringsAlternately1768 solution = new MergeStringsAlternately1768();

    @Test
    public void testCase1() {
        String word1 = "abc";
        String word2 = "pqr";
        String output = "apbqcr";

        assertEquals(output, solution.mergeAlternately(word1, word2));
    }

    @Test
    public void testCase2() {
        String word1 = "ab";
        String word2 = "pqrs";
        String output = "apbqrs";

        assertEquals(output, solution.mergeAlternately(word1, word2));
    }

    @Test
    public void testCase3() {
        String word1 = "abcd";
        String word2 = "pq";
        String output = "apbqcd";

        assertEquals(output, solution.mergeAlternately(word1, word2));
    }

}
