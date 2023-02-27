package com.qeeqez.leetcode.easy;

/**
 * 1309. Decrypt String from Alphabet to Integer Mapping
 * <p>
 * You are given a string s formed by digits and '#'. We want to map s to English lowercase characters as follows:
 * <p>
 * Characters ('a' to 'i') are represented by ('1' to '9') respectively.
 * Characters ('j' to 'z') are represented by ('10#' to '26#') respectively.
 * Return the string formed after mapping.
 * <p>
 * The test cases are generated so that a unique mapping will always exist.
 */
public class DecryptStringAlphabetIntegerMapping1309 {

    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (c == '#') {
                int secondChar = Character.getNumericValue(s.charAt(--i));
                int firstChar = Character.getNumericValue(s.charAt(--i));

                c = (char) (secondChar + firstChar * 10);
                sb.append((char) (c + 96));
            } else {
                sb.append((char) (c + 48));
            }
        }

        return sb.reverse().toString();
    }

}

