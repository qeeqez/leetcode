package com.qeeqez.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 77. Combinations
 * <p>
 * Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].
 * <p>
 * You may return the answer in any order.
 */
public class Combinations77 {

    private final List<List<Integer>> combinations = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        getCombinations(new ArrayList<>(), 1, n, k);
        return combinations;
    }

    private void getCombinations(List<Integer> current, int start, int n, int k) {
        if (k == 0) {
            combinations.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i <= n - k + 1; i++) {
            current.add(i);
            getCombinations(current, i + 1, n, k - 1);
            current.remove(current.size() - 1);
        }
    }

}

