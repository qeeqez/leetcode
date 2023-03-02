package com.qeeqez.leetcode.medium;

/**
 * 1855. Maximum Distance Between a Pair of Values
 * <p>
 * You are given two non-increasing 0-indexed integer arrays nums1 and nums2.
 * <p>
 * A pair of indices (i, j), where 0 <= i < nums1.length and 0 <= j < nums2.length,
 * is valid if both i <= j and nums1[i] <= nums2[j]. The distance of the pair is j - i.
 * <p>
 * Return the maximum distance of any valid pair (i, j).
 * If there are no valid pairs, return 0.
 * <p>
 * An array arr is non-increasing if arr[i-1] >= arr[i] for every 1 <= i < arr.length.
 */
public class MaximumDistanceBetweenPairOfValues1855 {

    public int maxDistance(int[] nums1, int[] nums2) {
        int maxDistance = 0;

        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) maxDistance = Math.max(maxDistance, j - i);
            else i++;

            j++;
        }

        return maxDistance;
    }

}

