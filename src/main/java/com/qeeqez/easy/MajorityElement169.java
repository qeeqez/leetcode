package com.qeeqez.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 169. Majority Element
 * <p>
 * Given an array nums of size n, return the majority element.
 * <p>
 * The majority element is the element that appears more than ⌊n / 2⌋ times.
 * You may assume that the majority element always exists in the array.
 */
public class MajorityElement169 {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majority = n / 2;
        Map<Integer, Integer> numCount = new HashMap<>();
        for (int value : nums) {
            int count = 1;
            if (numCount.containsKey(value)) {
                count = numCount.get(value) + 1;
            }
            if (count > majority) {
                return value;
            }
            numCount.put(value, count);
        }
        return n;
    }
}

