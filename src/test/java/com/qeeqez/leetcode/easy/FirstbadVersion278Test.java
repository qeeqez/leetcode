package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstbadVersion278Test {

    FirstBadVersion278 solution = new FirstBadVersion278();

    @Test
    public void testCase1() {
        int n = 5;
        int bad = 4;
        int output = 4;

        assertEquals(output, solution.firstBadVersion(n, bad));
    }

    @Test
    public void testCase2() {
        int n = 1;
        int bad = 1;
        int output = 1;

        assertEquals(output, solution.firstBadVersion(n, bad));
    }

    @Test
    public void testCase3() {
        int n = 15;
        int bad = 9;
        int output = 9;

        assertEquals(output, solution.firstBadVersion(n, bad));
    }

    @Test
    public void testCase4() {
        int n = 15;
        int bad = 8;
        int output = 8;

        assertEquals(output, solution.firstBadVersion(n, bad));
    }

    @Test
    public void testCase5() {
        int n = 150;
        int bad = 29;
        int output = 29;

        assertEquals(output, solution.firstBadVersion(n, bad));
    }
}
