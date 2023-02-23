package com.qeeqez.leetcode.easy;

/**
 * 278. First Bad Version
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

        int first = 1;
        int last = n;
        int middle = 0;

        while (last >= first) {
            middle = (last - first) / 2 + first;
            if (isBadVersion(middle, badVersion)) {
                if (last == first) return middle;
                last = middle;
            } else {
                first = middle + 1;
            }
        }
        return middle;
    }

    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
    private boolean isBadVersion(int version, int badVersion) {
        return version >= badVersion;
    }
}

