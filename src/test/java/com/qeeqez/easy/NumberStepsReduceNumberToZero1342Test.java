package com.qeeqez.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberStepsReduceNumberToZero1342Test {

    NumberOfStepsReduceNumberToZero1342 solution = new NumberOfStepsReduceNumberToZero1342();

    @Test
    public void testCase1() {
        int num = 14;
        int output = 6;

        assertEquals(output, solution.numberOfStepsBitshift(num));
        assertEquals(output, solution.numberOfSteps(num));
    }

    @Test
    public void testCase2() {
        int num = 8;
        int output = 4;

        assertEquals(output, solution.numberOfStepsBitshift(num));
        assertEquals(output, solution.numberOfSteps(num));
    }

    @Test
    public void testCase3() {
        int num = 123;
        int output = 12;

        assertEquals(output, solution.numberOfStepsBitshift(num));
        assertEquals(output, solution.numberOfSteps(num));
    }
}
