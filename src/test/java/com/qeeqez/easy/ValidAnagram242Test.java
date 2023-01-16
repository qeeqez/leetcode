package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidAnagram242Test {

    ValidAnagram242 solution = new ValidAnagram242();

    @Test
    public void testCase1() {
        String s = "anagram", t = "nagaram";

        assertTrue(solution.isAnagram(s, t));
    }

    @Test
    public void testCase2() {
        String s = "rat", t = "car";

        assertFalse(solution.isAnagram(s, t));
    }

    @Test
    public void testCase3() {
        String s = "rat", t = "tra";

        assertTrue(solution.isAnagram(s, t));
    }
}
