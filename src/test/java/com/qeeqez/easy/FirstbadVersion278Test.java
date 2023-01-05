package com.qeeqez.easy;

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
}
