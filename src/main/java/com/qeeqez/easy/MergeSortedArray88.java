package com.qeeqez.easy;

/**
 * 88. Merge Sorted Array
 * <p>
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
 * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
 * <p>
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 * <p>
 * The final sorted array should not be returned by the function,
 * but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n,
 * where the first m elements denote the elements that should be merged,
 * and the last n elements are set to 0 and should be ignored.
 * nums2 has a length of n.
 */
public class MergeSortedArray88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }

        int[] outArray = new int[m + n];
        int i = 0;
        int j = 0;

        if (m == 0) {
            for (i = 0; i < nums1.length; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }
        while (i < m || j < n) {
            if (j == n) {
                outArray[i + j] = nums1[i];
                i++;
            } else if (nums1[i] < nums2[j] && i < m) {
                outArray[i + j] = nums1[i];
                i++;
            } else {
                outArray[i + j] = nums2[j];
                j++;
            }
        }
        for (i = 0; i < nums1.length; i++) {
            nums1[i] = outArray[i];
        }
    }
}

