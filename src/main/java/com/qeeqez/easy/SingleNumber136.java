package com.qeeqez.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 136. Single Number
 * <p>
 * Given a non-empty array of integers nums, every element appears twice except for one.
 * Find that single one.
 * <p>
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 */
public class SingleNumber136 {

    // 100% CPU, 92% MEM
    public int singleNumber(int[] nums) {
        int output = 0;
        for (int num : nums) {
            output ^= num;
        }
        return output;
    }

    // 17% CPU, 18% MEM
    public int singleNumberSlow(int[] nums) {
        Set<Integer> unique = new HashSet<>();

        int maxValue = 100000;

        for (int num : nums) {
            if (unique.contains(num)) {
                num = num >= 0 ? num + maxValue : num - maxValue;
            }
            unique.add(num);
        }

        return unique.stream()
                .filter(i -> i > -maxValue && i < maxValue)
                .filter(i -> !unique.contains(i < 0 ? i - maxValue : i + maxValue))
                .findFirst().orElse(0);
    }

}

