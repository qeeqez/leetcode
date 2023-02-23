package com.qeeqez.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 1512. Number of Good Pairs
 * <p>
 * Given an array of integers nums, return the number of good pairs.
 * <p>
 * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 */
public class NumberOfGoodPairs1512 {

    // Faster solution, but with additional memory
    public int numIdenticalPairsMap(int[] nums) {
        int output = 0;
        Map<Integer, Integer> allValues = new HashMap<>();
        for (int item : nums) {
            int occurrences = allValues.getOrDefault(item, 0);
            output += occurrences;
            allValues.put(item, occurrences + 1);
        }
        return output;
    }

    public int numIdenticalPairsBruteForce(int[] nums) {
        int output = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i]) output++;
            }
        }
        return output;
    }
}

