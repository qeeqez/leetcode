package com.qeeqez.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LetterCasePermutation784Test {

    LetterCasePermutation784 solution = new LetterCasePermutation784();

    @Test
    public void testCase1() {
        String s = "a1b2";
        List<String> output = List.of("a1b2", "a1B2", "A1b2", "A1B2");

        assertEquals(output, solution.letterCasePermutation(s));
    }

    @Test
    public void testCase2() {
        String s = "3z4";
        List<String> output = List.of("3z4", "3Z4");

        assertEquals(output, solution.letterCasePermutation(s));
    }

}
