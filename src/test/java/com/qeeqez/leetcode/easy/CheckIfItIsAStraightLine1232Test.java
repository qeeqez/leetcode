package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckIfItIsAStraightLine1232Test {

    CheckIfItIsAStraightLine1232 solution = new CheckIfItIsAStraightLine1232();

    @Test
    public void testCase1() {
        int[][] coordinates = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}};

        assertTrue(solution.checkStraightLine(coordinates));
    }

    @Test
    public void testCase2() {
        int[][] coordinates = {{1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}};

        assertFalse(solution.checkStraightLine(coordinates));
    }

    @Test
    public void testCase3() {
        int[][] coordinates = {{1, 2}, {4, 5}, {5, 6}, {2, 3}, {3, 4}, {6, 7}};

        assertTrue(solution.checkStraightLine(coordinates));
    }

    @Test
    public void testCase4() {
        int[][] coordinates = {{1, 2}, {-5, -4}, {5, 6}, {2, 3}, {3, 4}, {6, 7}};

        assertTrue(solution.checkStraightLine(coordinates));
    }

    @Test
    public void testCase5() {
        int[][] coordinates = {{1, 2}, {-4, -5}, {5, 6}, {2, 3}, {3, 4}, {6, 7}};

        assertFalse(solution.checkStraightLine(coordinates));
    }

    @Test
    public void testCase6() {
        int[][] coordinates = {{0, 0}, {0, 1}, {0, -1}};

        assertTrue(solution.checkStraightLine(coordinates));
    }

    @Test
    public void testCase7() {
        int[][] coordinates = {{0, 0}, {1, 0}, {-1, 0}};

        assertTrue(solution.checkStraightLine(coordinates));
    }

    @Test
    public void testCase8() {
        int[][] coordinates = {{0, 0}, {0, 5}, {5, 5}, {5, 0}};

        assertFalse(solution.checkStraightLine(coordinates));
    }

    @Test
    public void testCase9() {
        int[][] coordinates = {{0, 1}, {1, 3}, {-4, -7}, {5, 11}};

        assertTrue(solution.checkStraightLine(coordinates));
    }

    @Test
    public void testCase10() {
        int[][] coordinates = {{1, -8}, {2, -3}, {1, 2}};

        assertFalse(solution.checkStraightLine(coordinates));
    }

}
