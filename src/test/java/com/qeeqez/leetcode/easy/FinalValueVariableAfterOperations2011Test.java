package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FinalValueVariableAfterOperations2011Test {

    FinalValueVaruableAfterOperations2011 solution = new FinalValueVaruableAfterOperations2011();

    @Test
    public void testCase1() {
        String[] operations = {"--X", "X++", "X++"};
        int output = 1;

        assertEquals(output, solution.finalValueAfterOperationsNormal(operations));
        assertEquals(output, solution.finalValueAfterOperations(operations));
    }

    @Test
    public void testCase2() {
        String[] operations = {"++X", "++X", "X++"};
        int output = 3;

        assertEquals(output, solution.finalValueAfterOperationsNormal(operations));
        assertEquals(output, solution.finalValueAfterOperations(operations));
    }

    @Test
    public void testCase3() {
        String[] operations = {"X++", "++X", "--X", "X--"};
        int output = 0;

        assertEquals(output, solution.finalValueAfterOperationsNormal(operations));
        assertEquals(output, solution.finalValueAfterOperations(operations));
    }
}
