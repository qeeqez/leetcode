package com.qeeqez.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 383. Ransom Note
 * <p>
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 * <p>
 * Each letter in magazine can only be used once in ransomNote.
 */
public class RansomNote383 {

    // Fast Alphabet Solution
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;

        int[] alphabet = new int[26];

        for (char c : magazine.toCharArray()) {
            int charCode = c - 'a';
            alphabet[charCode]++;
        }
        for (char c : ransomNote.toCharArray()) {
            int charCode = c - 'a';
            if (alphabet[charCode] == 0) return false;
            alphabet[charCode]--;
        }
        return true;
    }

    // HashMap Slow Solution
    public boolean canConstructHashMap(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;

        Map<Character, Integer> magazineCounter = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            int count = magazineCounter.getOrDefault(c, 0) + 1;
            magazineCounter.put(c, count);
        }
        for (char c : ransomNote.toCharArray()) {
            int value = magazineCounter.getOrDefault(c, 0);
            if (value > 0) {
                value -= 1;
                magazineCounter.put(c, value);
            } else {
                return false;
            }
        }
        return true;
    }

}

