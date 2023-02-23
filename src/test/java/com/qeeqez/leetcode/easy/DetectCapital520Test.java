package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DetectCapital520Test {

    DetectCapital520 solution = new DetectCapital520();

    @Test
    public void testCase1() {
        String word = "USA";

        assertTrue(solution.detectCapitalUse(word));
    }

    @Test
    public void testCase2() {
        String word = "FlaG";

        assertFalse(solution.detectCapitalUse(word));
    }

    @Test
    public void testCase3() {
        String word = "leetcode";

        assertTrue(solution.detectCapitalUse(word));
    }

    @Test
    public void testCase4() {
        String word = "Google";

        assertTrue(solution.detectCapitalUse(word));
    }

    @Test
    public void testCase5() {
        String word = "ffffffffffffffffffffF";

        assertFalse(solution.detectCapitalUse(word));
    }

    @Test
    public void testCase6() {
        String word = "mL";

        assertFalse(solution.detectCapitalUse(word));
    }

    @Test
    public void testCase7() {
        String word = "cVe";

        assertFalse(solution.detectCapitalUse(word));
    }
}
