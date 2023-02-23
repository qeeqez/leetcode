package com.qeeqez.leetcode.easy;

/**
 * 771. Jewels and Stones
 * <p>
 * You're given strings jewels representing the types of stones that are jewels,
 * and stones representing the stones you have.
 * Each character in stones is a type of stone you have.
 * You want to know how many of the stones you have are also jewels.
 * <p>
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 */
public class JewelsAndStones771 {

    // Fastest solution
    public int numJewelsInStones(String jewels, String stones) {
        int output = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1) {
                output++;
            }
        }
        return output;
    }

    // A little bit slower
    public int numJewelsInStonesSlow(String jewels, String stones) {
        int output = 0;
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if (stones.charAt(i) == jewels.charAt(j)) {
                    output++;
                }
            }
        }
        return output;
    }
}

