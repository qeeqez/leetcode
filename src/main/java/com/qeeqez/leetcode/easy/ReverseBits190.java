package com.qeeqez.leetcode.easy;

/**
 * 190. Reverse Bits
 * <p>
 * Reverse bits of a given 32 bits unsigned integer.
 * <p>
 * Note:
 * <p>
 * Note that in some languages, such as Java, there is no unsigned integer type.
 * In this case, the input will be given as a signed integer type.
 * It should not affect your implementation,
 * as the integer's internal binary representation is the same, whether it is signed or unsigned.
 * In Java, the compiler represents the signed integers using 2's complement notation.
 * Therefore, in Example 3, the input represents the signed integer. -3.
 */
public class ReverseBits190 {

    // you need treat n as an unsigned value
    // 90% CPU
    public int reverseBits(int n) {
        int reversed = 0;
        int bitCount = 32;
        for (int i = 0; i < bitCount; i++) {
            int lastBit = n & 1;
            reversed <<= 1;
            reversed |= lastBit;
            n >>>= 1;
        }
        return reversed;
    }
}

