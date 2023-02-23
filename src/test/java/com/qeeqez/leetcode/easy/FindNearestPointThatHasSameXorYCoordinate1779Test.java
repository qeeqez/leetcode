package com.qeeqez.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindNearestPointThatHasSameXorYCoordinate1779Test {

    FindNearestPointThatHasSameXorYCoordinate1779 solution = new FindNearestPointThatHasSameXorYCoordinate1779();

    @Test
    public void testCase1() {
        int x = 3;
        int y = 4;
        int[][] points = {{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}};
        int output = 2;

        assertEquals(output, solution.nearestValidPoint(x, y, points));
    }

    @Test
    public void testCase2() {
        int x = 3;
        int y = 4;
        int[][] points = {{3, 4}};
        int output = 0;

        assertEquals(output, solution.nearestValidPoint(x, y, points));
    }

    @Test
    public void testCase3() {
        int x = 3;
        int y = 4;
        int[][] points = {{2, 3}};
        int output = -1;

        assertEquals(output, solution.nearestValidPoint(x, y, points));
    }

}
