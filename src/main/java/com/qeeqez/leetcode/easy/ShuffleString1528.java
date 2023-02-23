package com.qeeqez.leetcode.easy;

/**
 * 1528. Shuffle String
 * <p>
 * You are given a string s and an integer array indices of the same length.
 * The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
 * <p>
 * Return the shuffled string.
 */
public class ShuffleString1528 {

    // Less memory solution
    public String restoreString(String s, int[] indices) {
        char[] output = new char[indices.length];
        char[] array = s.toCharArray();

        for (int i = 0; i < indices.length; i++) {
            output[indices[i]] = array[i];
        }
        return new String(output);
    }

    // Faster solution
    public String restoreStringSlow(String s, int[] indices) {
        char[] output = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            output[indices[i]] = s.charAt(i);
        }
        return new String(output);
    }

    // Straightforward solution
    public String restoreStringSlowest(String s, int[] indices) {
        StringBuilder output = new StringBuilder(s);
        for (int i = 0; i < indices.length; i++) {
            output.setCharAt(indices[i], s.charAt(i));
        }
        return output.toString();
    }

}

