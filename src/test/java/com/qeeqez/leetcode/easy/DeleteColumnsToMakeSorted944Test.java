package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeleteColumnsToMakeSorted944Test {

    DeleteColumnToMakeSorted944 solution = new DeleteColumnToMakeSorted944();

    @Test
    public void testCase1() {
        String[] strs = {"cba", "daf", "ghi"};
        int output = 1;

        assertEquals(output, solution.minDeletionSizeSlow(strs));
        assertEquals(output, solution.minDeletionSize(strs));
    }

    @Test
    public void testCase2() {
        String[] strs = {"a", "b"};
        int output = 0;

        assertEquals(output, solution.minDeletionSizeSlow(strs));
        assertEquals(output, solution.minDeletionSize(strs));
    }

    @Test
    public void testCase3() {
        String[] strs = {"zyx", "wvu", "tsr"};
        int output = 3;

        assertEquals(output, solution.minDeletionSizeSlow(strs));
        assertEquals(output, solution.minDeletionSize(strs));
    }

    @Test
    public void testCase4() {
        String[] strs = {"x", "q"};
        int output = 1;

        assertEquals(output, solution.minDeletionSizeSlow(strs));
        assertEquals(output, solution.minDeletionSize(strs));
    }

}
