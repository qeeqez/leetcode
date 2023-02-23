package com.qeeqez.leetcode.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 118. Pascal's Triangle
 * <p>
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * <p>
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 */
public class PascalsTriangle118 {

    // Faster as we skip some iterations
    public List<List<Integer>> generateOptimized(int numRows) {
        List<List<Integer>> output = new ArrayList<>();

        List<Integer> current = new LinkedList<>();
        current.add(1);
        output.add(current);
        List<Integer> previous = current;

        for (int i = 2; i <= numRows; i++) {
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
            output.add(current);
            previous = current;
        }
        return output;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();

        List<Integer> current = new LinkedList<>();
        current.add(1);
        output.add(current);
        List<Integer> previous = current;

        for (int i = 2; i <= numRows; i++) {
            current = new LinkedList<>();
            current.add(1);
            current.add(1);
            for (int j = 1; j < i - 1; j++) {
                int sum = previous.get(j) + previous.get(j - 1);
                current.add(j, sum);
            }
            output.add(current);
            previous = current;
        }
        return output;
    }
}

