package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckIfSentencePangram1832Test {

    CheckIfSentencePangram1832 solution = new CheckIfSentencePangram1832();

    @Test
    public void testCase1() {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        assertTrue(solution.checkIfPangramHashSet(sentence));
        assertTrue(solution.checkIfPangram(sentence));
    }

    @Test
    public void testCase2() {
        String sentence = "leetcode";

        assertFalse(solution.checkIfPangramHashSet(sentence));
        assertFalse(solution.checkIfPangram(sentence));
    }
}