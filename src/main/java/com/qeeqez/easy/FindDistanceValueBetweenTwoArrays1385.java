package com.qeeqez.easy;

import java.util.Arrays;

/**
 * 1385. Find the Distance Value Between Two Arrays
 * <p>
 * Given two integer arrays arr1 and arr2, and the integer d, return the distance value between the two arrays.
 * <p>
 * The distance value is defined as the number of elements arr1[i] such that there is not any element arr2[j] where |arr1[i]-arr2[j]| <= d.
 */
public class FindDistanceValueBetweenTwoArrays1385 {

    // Binary Search Solution
    // Same speed as BruteForce but task was meant to implement Binary Search
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int output = 0;
        Arrays.sort(arr2);

        for (int item : arr1) {
            if (!isValid(arr2, item, d)) {
                output++;
            }
        }
        return output;
    }

    public boolean isValid(int[] arr, int value, int target) {
        int first = 0;
        int last = arr.length - 1;
        int middle;

        while (last >= first) {
            middle = (last - first) / 2 + first;
            int difference = arr[middle] - value;
            if (Math.abs(difference) <= target) return true;

            if (arr[middle] <= value) {
                first = middle + 1;
            } else {
                last = middle - 1;
            }
        }
        return false;
    }

    public int findTheDistanceValueBruteForce(int[] arr1, int[] arr2, int d) {
        int output = 0;
        for (int i : arr1) {
            boolean isDistant = false;
            for (int j : arr2) {
                if (Math.abs(i - j) <= d) {
                    isDistant = true;
                    break;
                }
            }
            if (!isDistant) {
                output++;
            }
        }
        return output;
    }
}

