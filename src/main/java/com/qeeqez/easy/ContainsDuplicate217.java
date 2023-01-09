package com.qeeqez.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 217. Contains Duplicate
 * <p>
 * Given an integer array nums,
 * return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 */
public class ContainsDuplicate217 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for (int num : nums) {
            if (!unique.add(num)) return true;
        }
        return false;
    }
}

