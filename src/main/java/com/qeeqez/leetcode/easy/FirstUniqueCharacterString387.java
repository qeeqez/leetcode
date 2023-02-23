package com.qeeqez.leetcode.easy;

/**
 * 387. First Unique Character in a String
 * <p>
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 */
public class FirstUniqueCharacterString387 {

    public int firstUniqChar(String s) {
        int alphabetLength = 26;

        return s.length() > alphabetLength ?
                firstUniqCharAlphabet(s) : firstUniqCharString(s);
    }

    private int firstUniqCharAlphabet(String s) {
        int result = Integer.MAX_VALUE;

        for (char c = 'a'; c <= 'z'; c++) {
            int index = s.indexOf(c);
            if (index == s.lastIndexOf(c) && index != -1) {
                result = Math.min(result, index);
            }
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }

    public int firstUniqCharString(String s) {
        for (char c : s.toCharArray()) {
            int index = s.indexOf(c);
            if (index == s.lastIndexOf(c)) return index;
        }
        return -1;
    }
}

