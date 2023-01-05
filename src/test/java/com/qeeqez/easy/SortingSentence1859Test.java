package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingSentence1859Test {

    SortingSentence1859 solution = new SortingSentence1859();

    @Test
    public void testCase1() {
        String s = "is2 sentence4 This1 a3";
        String output = "This is a sentence";

        assertEquals(output, solution.sortSentence(s));
    }

    @Test
    public void testCase2() {
        String s = "Myself2 Me1 I4 and3";
        String output = "Me Myself and I";

        assertEquals(output, solution.sortSentence(s));
    }
}
