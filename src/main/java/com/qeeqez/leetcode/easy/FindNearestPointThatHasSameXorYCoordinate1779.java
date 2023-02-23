package com.qeeqez.leetcode.easy;

/**
 * 1779. Find Nearest Point That Has the Same X or Y Coordinate
 * <p>
 * You are given two integers, x and y, which represent your current location on a Cartesian grid: (x, y).
 * You are also given an array points where each points[i] = [ai, bi] represents that a point exists at (ai, bi).
 * A point is valid if it shares the same x-coordinate or the same y-coordinate as your location.
 * <p>
 * Return the index (0-indexed) of the valid point with the smallest Manhattan distance from your current location.
 * If there are multiple, return the valid point with the smallest index. If there are no valid points, return -1.
 * <p>
 * The Manhattan distance between two points (x1, y1) and (x2, y2) is abs(x1 - x2) + abs(y1 - y2).
 */
public class FindNearestPointThatHasSameXorYCoordinate1779 {

    public int nearestValidPoint(int x, int y, int[][] points) {
        int[] point1 = {x, y};
        int minManhattanDistance = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < points.length; i++) {
            if (pointsValid(point1, points[i])) {
                int manhattanDistance = manhattanDistance(point1, points[i]);
                if (minManhattanDistance > manhattanDistance) {
                    minManhattanDistance = manhattanDistance;
                    minIndex = i;
                }
            }
        }

        return minIndex;
    }

    private boolean pointsValid(int[] point1, int[] point2) {
        return point1[0] == point2[0] || point1[1] == point2[1];
    }

    private int manhattanDistance(int[] point1, int[] point2) {
        return Math.abs(point1[0] - point2[0]) + Math.abs(point1[1] - point2[1]);
    }

}

