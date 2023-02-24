package com.qeeqez.leetcode.easy;

/**
 * 1232. Check If It Is a Straight Line
 * <p>
 * You are given an array coordinates, coordinates[i] = [x, y], where [x, y] represents the coordinate of a point.
 * Check if these points make a straight line in the XY plane.
 */
public class CheckIfItIsAStraightLine1232 {

    // 100% CPU
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length == 2) return true;

        double tangent = 0;
        Direction direction = Direction.NONE;

        for (int i = 0; i < coordinates.length - 1; i++) {
            int[] c1 = coordinates[i];
            int[] c2 = coordinates[i + 1];

            boolean isAngle = isAngle(c1, c2);

            if (isAngle) {
                if (direction != Direction.NONE) return false;

                double current = tangent(c1, c2);
                if (i == 0) tangent = current;
                if (current != tangent) return false;
            } else {
                if (tangent != 0) return false;

                Direction current = getDirection(c1, c2);
                if (i == 0) direction = current;
                if (current != direction) return false;
            }
        }

        return true;
    }

    private boolean isAngle(int[] coordinate1, int[] coordinate2) {
        return isAngle(coordinate1[0], coordinate1[1], coordinate2[0], coordinate2[1]);
    }

    private Direction getDirection(int[] coordinate1, int[] coordinate2) {
        return getDirection(coordinate1[0], coordinate1[1], coordinate2[0], coordinate2[1]);
    }

    private double tangent(int[] coordinate1, int[] coordinate2) {
        return tangent(coordinate1[0], coordinate1[1], coordinate2[0], coordinate2[1]);
    }

    private boolean isAngle(int x1, int y1, int x2, int y2) {
        return x1 != x2 && y1 != y2;
    }

    private Direction getDirection(int x1, int y1, int x2, int y2) {
        if (x1 == x2) return Direction.X;
        if (y1 == y2) return Direction.Y;
        return Direction.NONE;
    }

    private double tangent(int x1, int y1, int x2, int y2) {
        int x = x2 - x1;
        int y = y2 - y1;
        return x == 0 ? 0 : (double) y / x;
    }

    private enum Direction {NONE, X, Y}

}

