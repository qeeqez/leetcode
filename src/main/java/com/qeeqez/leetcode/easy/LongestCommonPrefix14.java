package com.qeeqez.leetcode.easy;

/**
 * 14. Longest Common Prefix
 * <p>
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 */
public class LongestCommonPrefix14 {
    public String longestCommonPrefix(String[] strs) {
        for (int i = 1; i < strs.length; i++) {
            int length = strs[i].length();
            if (length < strs[0].length()) {
                strs[0] = strs[0].substring(0, length);
            }
            for (int j = 0; j < strs[0].length(); j++) {
                if (strs[0].charAt(j) != strs[i].charAt(j)) {
                    strs[0] = strs[0].substring(0, j);
                    break;
                }
            }
        }
        return strs[0];
    }
}

