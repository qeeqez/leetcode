package com.qeeqez.leetcode.easy;

/**
 * 1768. Merge Strings Alternately
 * <p>
 * You are given two strings word1 and word2.
 * Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 * <p>
 * Return the merged string.
 */
public class MergeStringsAlternately1768 {

    public String mergeAlternately(String word1, String word2) {
        int length = Math.max(word1.length(), word2.length());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i < word1.length()) sb.append(word1.charAt(i));
            if (i < word2.length()) sb.append(word2.charAt(i));
        }

        return sb.toString();
    }

}

