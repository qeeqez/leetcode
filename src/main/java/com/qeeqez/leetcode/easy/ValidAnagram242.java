package com.qeeqez.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 242. Valid Anagram
 * <p>
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 */
public class ValidAnagram242 {

    // Fast Alphabet Solution
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] occurrences = new int[26];

        for (int i = 0; i < s.length(); i++) {
            occurrences[s.charAt(i) - 'a']++;
            occurrences[t.charAt(i) - 'a']--;
        }

        for (int val : occurrences) {
            if (val != 0) return false;
        }

        return true;
    }

    // HashMap Slow Solution
    public boolean isAnagramHashMap(String s, String t) {
        Map<Character, Integer> occurrences = new HashMap<>();

        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            char cS = s.charAt(i);
            char cT = t.charAt(i);
            occurrences.put(cS, occurrences.getOrDefault(cS, 0) + 1);
            occurrences.put(cT, occurrences.getOrDefault(cT, 0) - 1);
        }

        return occurrences.values().stream().noneMatch(val -> val != 0);
    }

}

