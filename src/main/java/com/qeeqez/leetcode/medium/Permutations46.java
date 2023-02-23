package com.qeeqez.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 46. Permutations
 * <p>
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 * <p>
 * In other words, return true if one of s1's permutations is the substring of s2.
 */
public class Permutations46 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<>();
        getCombinations(permutations, new ArrayList<>(), nums);
        return permutations;
    }

    private void getCombinations(List<List<Integer>> permutations, List<Integer> current, int[] nums) {
        if (current.size() == nums.length) {
            permutations.add(new ArrayList<>(current));
            return;
        }
        for (int num : nums) {
            if (current.contains(num)) continue;
            current.add(num);
            getCombinations(permutations, current, nums);
            current.remove(current.size() - 1);
        }
    }

}

