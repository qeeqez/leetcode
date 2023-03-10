package com.qeeqez.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum
 * <p>
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 */
public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        int[] output = {0, 0};

        for (int i = 0; i < nums.length; i++) {
            int secondNumber = target - nums[i];
            if (numsMap.containsKey(secondNumber)) {
                output[1] = i;
                output[0] = numsMap.get(secondNumber);
                return output;
            }
            numsMap.put(nums[i], i);
        }
        return output;
    }
}

