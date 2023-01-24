package com.qeeqez.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniquePaths62Test {

    UniquePaths62 solution = new UniquePaths62();

    @Test
    public void testCase1() {
        int m = 3, n = 7;
        int output = 28;

        assertEquals(output, solution.uniquePaths(m, n));
        assertEquals(output, solution.uniquePathsRecursive(m, n));
    }

    @Test
    public void testCase2() {
        int m = 3, n = 2;
        int output = 3;

        assertEquals(output, solution.uniquePaths(m, n));
        assertEquals(output, solution.uniquePathsRecursive(m, n));
    }

    @Test
    public void testCase3() {
        int m = 1, n = 1;
        int output = 1;

        assertEquals(output, solution.uniquePaths(m, n));
        assertEquals(output, solution.uniquePathsRecursive(m, n));
    }

    @Test
    public void testCase4() {
        int m = 3, n = 3;
        int output = 6;

        assertEquals(output, solution.uniquePaths(m, n));
        assertEquals(output, solution.uniquePathsRecursive(m, n));
    }

    @Test
    public void testCase5() {
        int m = 51, n = 9;
        int output = 1916797311;

        // solution.uniquePathsRecursive will run infinitely here
        assertEquals(output, solution.uniquePaths(m, n));
    }

}
