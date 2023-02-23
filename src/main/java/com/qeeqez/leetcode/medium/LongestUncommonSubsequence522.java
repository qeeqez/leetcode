package com.qeeqez.leetcode.medium;

/**
 * 522. Longest Uncommon Subsequence II
 * <p>
 * Given an array of strings strs, return the length of the longest uncommon subsequence between them.
 * If the longest uncommon subsequence does not exist, return -1.
 * <p>
 * An uncommon subsequence between an array of strings is a string that is a subsequence of one string but not the others.
 * <p>
 * A subsequence of a string s is a string that can be obtained after deleting any number of characters from s.
 * <p>
 * For example, "abc" is a subsequence of "aebdc" because you can delete the underlined characters in "aebdc" to get "abc".
 * Other subsequences of "aebdc" include "aebdc", "aeb", and "" (empty string).
 */
public class LongestUncommonSubsequence522 {
    public int findLUSlength(String[] strs) {
        int output = -1;
        int size = strs.length;
        for (int i = 0, j; i < size; i++) {
            for (j = 0; j < size; j++) {
                if (i == j) continue;
                if (isSubsequence(strs[i], strs[j])) break;
            }
            if (j == size) {
                output = Math.max(output, strs[i].length());
            }
        }
        return output;
    }

    boolean isSubsequence(String a, String b) {
        int i = 0;
        for (int j = 0; i < a.length() && j < b.length(); j++) {
            if (a.charAt(i) == b.charAt(j)) i++;
        }
        return i == a.length();
    }
}

