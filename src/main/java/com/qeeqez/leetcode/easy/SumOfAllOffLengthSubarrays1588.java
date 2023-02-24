package com.qeeqez.leetcode.easy;

/**
 * 1588. Sum of All Odd Length Subarrays
 * <p>
 * Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.
 * <p>
 * A subarray is a contiguous subsequence of the array.
 */
public class SumOfAllOffLengthSubarrays1588 {

    // 100% CPU, 92% MEM
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int end = i + 1;                    // No of subarrays that end with number at index i
            int start = n - i;                  // No of subarrays that start with number at index i
            int total = end * start;            // Total number of subarrays that number at index i can make
            int odd = total / 2 + total % 2;    // Dividing subarrays into odd and even subarrays
            sum += odd * arr[i];                // now each number appears odd times in subarrays so odd*number add
        }

        return sum;
    }

    // 62% CPU, 20% MEM
    public int sumOddLengthSubarraysBruteForce(int[] arr) {
        int sum = 0;

        int length = arr.length;
        length = length % 2 == 0 ? length - 1 : length;

        while (length > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (length + i > arr.length) break;

                for (int j = i; j < i + length; j++) {
                    sum += arr[j];
                }
            }
            length -= 2;
        }

        return sum;
    }

}