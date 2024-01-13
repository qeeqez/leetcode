package com.qeeqez.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * 167. Two Sum II - Input Array Is Sorted
 * <p>
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
 * find two numbers such that they add up to a specific target number.
 * Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 * <p>
 * Return the indices of the two numbers, index1 and index2,
 * added by one as an integer array [index1, index2] of length 2.
 * <p>
 * The tests are generated such that there is exactly one solution.
 * You may not use the same element twice.
 * <p>
 * Your solution must use only constant extra space.
 */
public class TwoSumIIInputArraySorted167 {

    // 100% CPU, 47% MEM
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum > target) right--;
            else if (sum < target) left++;
            else return new int[]{left + 1, right + 1};
        }

        return new int[]{};
    }

    // 29% CPU, 95% MEM
    public int[] twoSumHashMap(int[] nums, int target) {
        Map<Integer, Integer> numsMap = new HashMap<>();
        int[] output = {0, 0};

        for (int i = 0; i < nums.length; i++) {
            int secondNumber = target - nums[i];
            if (numsMap.containsKey(secondNumber)) {
                output[1] = i + 1;
                output[0] = numsMap.get(secondNumber) + 1;
                return output;
            }
            numsMap.put(nums[i], i);
        }
        return output;
    }

    // Time Limit Exceeded
    public int[] twoSumBruteForce(int[] numbers, int target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return new int[]{};
    }
}

