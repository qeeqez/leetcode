package com.qeeqez.medium;

/**
 * 567. Permutation in String
 * <p>
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 * <p>
 * In other words, return true if one of s1's permutations is the substring of s2.
 */
public class PermutationString567 {

    // 99% CPU, 92% MEM
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length();
        int len2 = s2.length();

        if (len1 > len2) return false;

        int[] frequencies = new int[26];

        for (int i = 0; i < len1; i++) {
            frequencies[s1.charAt(i) - 'a']++;
            frequencies[s2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < len2 - len1; i++) {
            if (checkAnagram(frequencies)) {
                return true;
            }
            frequencies[s2.charAt(i) - 'a']++;
            frequencies[s2.charAt(i + len1) - 'a']--;
        }

        return checkAnagram(frequencies);
    }

    private boolean checkAnagram(int[] freq) {
        for (int item : freq) {
            if (item != 0) {
                return false;
            }
        }
        return true;
    }

}

