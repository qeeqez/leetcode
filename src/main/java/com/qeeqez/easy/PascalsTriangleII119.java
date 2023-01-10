package com.qeeqez.easy;

import java.util.LinkedList;
import java.util.List;

/**
 * 119. Pascal's Triangle II
 * <p>
 * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
 * <p>
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 */
public class PascalsTriangleII119 {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> current = new LinkedList<>();
        current.add(1);
        List<Integer> previous = current;

        for (int i = 2; i <= rowIndex + 1; i++) {
            current = new LinkedList<>();
            current.add(1);
            current.add(1);
            for (int j = 1; j < (i + 1) / 2; j++) {
                int sum = previous.get(j) + previous.get(j - 1);
                current.add(j, sum);
                if (i % 2 != 0 && j == i / 2) {
                    continue;
                }
                current.add(j, sum);
            }
            previous = current;
        }
        return current;
    }
}

