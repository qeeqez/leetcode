package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbingStairs70Test {

    ClimbingStairs70 solution = new ClimbingStairs70();

    @Test
    public void testCase1() {
        int n = 1;
        int output = 1;

        assertEquals(output, solution.climbStairs(n));
    }

    @Test
    public void testCase2() {
        int n = 2;
        int output = 2;

        assertEquals(output, solution.climbStairs(n));
    }

    @Test
    public void testCase3() {
        int n = 3;
        int output = 3;

        assertEquals(output, solution.climbStairs(n));
    }

    /*
     1 1 1 1
     1 1 2
     1 2 1
     2 1 1
     2 2
    */
    @Test
    public void testCase4() {
        int n = 4;
        int output = 5;

        assertEquals(output, solution.climbStairs(n));
    }

    /*
     1 1 1 1 1
     1 1 1 2
     1 1 2 1
     1 2 1 1
     2 1 1 1
     1 2 2
     2 1 2
     2 2 1
    */
    @Test
    public void testCase5() {
        int n = 5;
        int output = 8;

        assertEquals(output, solution.climbStairs(n));
    }

    @Test
    public void testCase10() {
        int n = 10;
        int output = 89;

        assertEquals(output, solution.climbStairs(n));
    }

}
