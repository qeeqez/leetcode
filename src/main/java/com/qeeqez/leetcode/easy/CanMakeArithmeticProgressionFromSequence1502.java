package com.qeeqez.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 1502. Can Make Arithmetic Progression From Sequence
 * <p>
 * A sequence of numbers is called an arithmetic progression
 * if the difference between any two consecutive elements is the same.
 * <p>
 * Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression.
 * Otherwise, return false.
 */
public class CanMakeArithmeticProgressionFromSequence1502 {

    // 100% CPU
    public boolean canMakeArithmeticProgression(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n = arr.length;

        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        if ((max - min) % (n - 1) != 0) return false;

        int step = (max - min) / (n - 1);
        if (step == 0) return true;  // [0, 0, 0]

        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if ((num - min) % step != 0) return false;
            if (!set.add(num)) return false;
        }

        return true;
    }

    // 50% CPU
    public boolean canMakeArithmeticProgressionSlow(int[] arr) {
        Arrays.sort(arr);

        int diff = arr[0] - arr[1];

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] - arr[i + 1] != diff) return false;
        }

        return true;
    }

}

