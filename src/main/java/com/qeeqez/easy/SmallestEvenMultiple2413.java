package com.qeeqez.easy;

/**
 * 2413. Smallest Even Multiple
 * <p>
 * Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.
 */
public class SmallestEvenMultiple2413 {

    // 100% CPU, 100% MEM
    public int smallestEvenMultipleBitShift(int n) {
        return (n & 1) == 0 ? n : n << 1;
    }

    // 100% CPU, 40% MEM
    public int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : n * 2;
    }

}

