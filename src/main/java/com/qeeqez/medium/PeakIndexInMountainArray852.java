package com.qeeqez.medium;

/**
 * 852. Peak Index in a Mountain Array
 * <p>
 * An array arr a mountain if the following properties hold:
 * <p>
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 * Given a mountain array arr, return the index i such that
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
 * <p>
 * You must solve it in O(log(arr.length)) time complexity.
 */
public class PeakIndexInMountainArray852 {

    // 100% CPU, 62% MEM
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int middle = (left + right) / 2;

            if (arr[middle] > arr[middle - 1] && arr[middle] > arr[middle + 1]) return middle;
            else if (arr[middle] < arr[middle + 1]) left = middle + 1;
            else right = middle;
        }

        return left;
    }

}

