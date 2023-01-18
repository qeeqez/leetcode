package com.qeeqez.easy;

/**
 * 1539. Kth Missing Positive Number
 * <p>
 * Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
 * <p>
 * Return the kth positive integer that is missing from this array.
 */
public class KthMissingPositiveNumber1539 {

    // Binary Search Fast Solution
    public int findKthPositive(int[] arr, int k) {
        if (arr[0] > k) return k;

        int first = 0;
        int last = arr.length - 1;

        int target = 0;
        int missingLeft = 0;

        while (first <= last) {
            int middle = (last - first) / 2 + first;

            int missing = arr[middle] - (middle + 1);
            if (missing < k) {
                first = middle + 1;

                target = middle;
                missingLeft = k - missing;
            } else {
                last = middle - 1;
            }
        }

        return arr[target] + missingLeft;
    }
}

