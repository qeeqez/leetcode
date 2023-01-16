package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RansomNote383Test {

    RansomNote383 solution = new RansomNote383();

    @Test
    public void testCase1() {
        String ransomNote = "a", magazine = "b";

        assertFalse(solution.canConstructHashMap(ransomNote, magazine));
        assertFalse(solution.canConstruct(ransomNote, magazine));
    }

    @Test
    public void testCase2() {
        String ransomNote = "aa", magazine = "ab";

        assertFalse(solution.canConstructHashMap(ransomNote, magazine));
        assertFalse(solution.canConstruct(ransomNote, magazine));
    }

    @Test
    public void testCase3() {
        String ransomNote = "aa", magazine = "aab";

        assertTrue(solution.canConstructHashMap(ransomNote, magazine));
        assertTrue(solution.canConstruct(ransomNote, magazine));
    }
}
