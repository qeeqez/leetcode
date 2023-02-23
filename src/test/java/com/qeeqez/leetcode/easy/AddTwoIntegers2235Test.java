package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddTwoIntegers2235Test {

    AddTwoIntegers2235 solution = new AddTwoIntegers2235();

    @Test
    public void testCase1() {
        int num1 = 12;
        int num2 = 5;
        int output = 17;

        assertEquals(output, solution.sum(num1, num2));
        assertEquals(output, solution.sumBitwise(num1, num2));
    }

    @Test
    public void testCase2() {
        int num1 = -10;
        int num2 = 4;
        int output = -6;

        assertEquals(output, solution.sum(num1, num2));
        assertEquals(output, solution.sumBitwise(num1, num2));
    }

}
