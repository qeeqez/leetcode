package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WordPattern290Test {

    WordPattern290 solution = new WordPattern290();

    @Test
    public void testCase1() {
        String pattern = "abba", s = "dog cat cat dog";

        assertTrue(solution.wordPattern(pattern, s));
    }

    @Test
    public void testCase2() {
        String pattern = "abba", s = "dog cat cat fish";

        assertFalse(solution.wordPattern(pattern, s));
    }

    @Test
    public void testCase3() {
        String pattern = "aaaa", s = "dog cat cat dog";

        assertFalse(solution.wordPattern(pattern, s));
    }

    @Test
    public void testCase4() {
        String pattern = "abba", s = "dog dog dog dog";

        assertFalse(solution.wordPattern(pattern, s));
    }

    @Test
    public void testCase5() {
        String pattern = "abc", s = "b c a";

        assertTrue(solution.wordPattern(pattern, s));
    }

    @Test
    public void testCase6() {
        String pattern = "aaa", s = "aa aa aa aa";

        assertFalse(solution.wordPattern(pattern, s));
    }
}
