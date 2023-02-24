package com.qeeqez.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 118. Pascal's Triangle
 * <p>
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * <p>
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 */
public class PascalsTriangle118 {

    // 86% CPU - 1 ms
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> current = new ArrayList<>();
            current.add(1);
            for (int j = 1; j < i; j++) {
                List<Integer> previous = output.get(i - 1);
                int sum = previous.get(j - 1) + previous.get(j);
                current.add(sum);
            }
            if (i > 0) current.add(1);
            output.add(current);
        }
        return output;
    }
}

