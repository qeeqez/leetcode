package com.qeeqez.leetcode.easy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 1356. Sort Integers by The Number of 1 Bits
 * <p>
 * You are given an integer array arr.
 * Sort the integers in the array in ascending order by the number of 1's in their binary representation and
 * in case of two or more integers have the same number of 1's you have to sort them in ascending order.
 * <p>
 * Return the array after sorting it.
 */
public class SortIntegersByTheNumberOf1Bits1356 {

    private final Comparator<Integer> comparator = (o1, o2) -> {
        int count1 = Integer.bitCount(o1);
        int count2 = Integer.bitCount(o2);
        if (count1 == count2) return o1.compareTo(o2);
        return Integer.compare(count1, count2);
    };

    public int[] sortByBits(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted(comparator)
                .mapToInt(Integer::intValue)
                .toArray();
    }

}

