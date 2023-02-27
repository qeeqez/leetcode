package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VerifyingAlienDictionary953Test {

    VerifyingAlienDictionary953 solution = new VerifyingAlienDictionary953();

    @Test
    public void testCase1() {
        String[] words = {"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";

        assertTrue(solution.isAlienSorted(words, order));
    }

    @Test
    public void testCase2() {
        String[] words = {"word", "world", "row"};
        String order = "worldabcefghijkmnpqstuvxyz";

        assertFalse(solution.isAlienSorted(words, order));
    }

    @Test
    public void testCase3() {
        String[] words = {"apple", "app"};
        String order = "abcdefghijklmnopqrstuvwxyz";

        assertFalse(solution.isAlienSorted(words, order));
    }

}
