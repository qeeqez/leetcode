package com.qeeqez.easy;

/**
 * 2520. Count the Digits That Divide a Number
 * <p>
 * You are a product manager and currently leading a team to develop a new product.
 * Unfortunately, the latest version of your product fails the quality check.
 * Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 * <p>
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 * <p>
 * You are given an API bool isBadVersion(version) which returns whether version is bad.
 * Implement a function to find the first bad version.
 * You should minimize the number of calls to the API.
 */
public class FirstBadVersion278 {
    public int firstBadVersion(int n, int badVersion) {
        if (n == 1) {
            return 1;
        }

        int pivot;
        int right = n;
        int left = 1;
        int lastTrue = 0;

        while (right >= left) {
            pivot = left + (right - left) / 2;
            if (isBadVersion(pivot, badVersion)) {
                lastTrue = pivot;
                right = pivot - 1;
            } else {
                left = pivot + 1;
            }
        }

        return lastTrue;
    }

    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
    private boolean isBadVersion(int version, int badVersion) {
        return version == badVersion;
    }
}

