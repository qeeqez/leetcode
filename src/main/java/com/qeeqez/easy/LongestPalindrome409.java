package com.qeeqez.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 409. Longest Palindrome
 * <p>
 * Given a string s which consists of lowercase or uppercase letters,
 * return the length of the longest palindrome that can be built with those letters.
 * <p>
 * Letters are case-sensitive, for example, "Aa" is not considered a palindrome here.
 */
public class LongestPalindrome409 {

    // Fast, array as map
    public int longestPalindrome(String s) {
        int[] frequencies = new int[256];
        for (char c : s.toCharArray()) frequencies[c]++;

        int output = 0;
        int hasOdd = 0;
        for (int count : frequencies) {
            output += count / 2;
            if (hasOdd == 0 && count % 2 != 0) hasOdd = 1;
        }

        return 2 * output + hasOdd;
    }

    // HashMap Slow Solution
    public int longestPalindromeHashMap(String s) {
        Map<Character, Integer> counter = new HashMap<>();
        for (char c : s.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }

        boolean allowOdd = true;
        int palindromeLength = 0;

        for (int value : counter.values()) {
            boolean isOdd = value % 2 != 0;
            if (isOdd && allowOdd) {
                palindromeLength += value;
                allowOdd = false;
            } else {
                palindromeLength += isOdd ? value - 1 : value;
            }
        }

        return palindromeLength;
    }

    // Slowest HashSet solution
    public int longestPalindromeHashSet(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (set.contains(c)) set.remove(c);
            else set.add(c);
        }

        int odd = set.size();
        return s.length() - (odd == 0 ? 0 : odd - 1);
    }

}

